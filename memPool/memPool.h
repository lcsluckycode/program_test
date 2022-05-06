#ifndef __MEMPOOL_H
#define __MEMPOOL_H

#include <iostream>
using namespace std;

template<int objectSize, int numOfObject = 20>
class MemPool
{
private:
    struct FreeNode {
        FreeNode* pNext;
        char data[objectSize];
    };

    struct MemBlock {
        MemBlock* pNext;
        FreeNode data[numOfObject];
    };

    FreeNode *freeNodeHeader;
    MemBlock *memBlockHeader;

public:
    MemPool() {
        freeNodeHeader = nullptr;
        memBlockHeader = nullptr;
    }

    ~MemBlock() {
        MemBlock* ptr;
        while (memBlockHeader) {
            ptr = memBlockHeader->pNext;
            delete memBlockHeader;
            memBlockHeader = ptr;
        }
    }

    void* malloc();
    void free(void*);
};

#endif