#include "memPool.h"

class ActualClass
{
private:
    static int count;
    int num;

public:
    ActualClass() {
        num = count;
        count++;
    }

    void print() {
        cout << this << ":";
        cout << "the " << num << "th object" << endl;
    }

    void* operator new(size_t size);
    void operator delete(void *p);
};

MemPool<sizeof(ActualClass), 2> mp;

void* ActualClass::operator new(size_t size) {
    return mp.malloc();
}

void ActualClass::operator delete(void *p) {
    mp.free(p);
}

int ActualClass::count = 0;

int main() {
    ActualClass *p1 = new ActualClass();
    p1->print();

    ActualClass *p2 = new ActualClass();
    p2->print();

    ActualClass* p3 = new ActualClass();
    p3->print();

    delete p1;
    delete p2;
    delete p3;
    return 1;
}