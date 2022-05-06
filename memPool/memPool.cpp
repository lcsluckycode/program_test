#include "memPool.h"

template<int objectSize, int numOfObject>
void* MemPool<objectSize, numOfObject>::malloc() {
    
    //无空闲节点，申请新的内存

    if (freeNodeHeader == nullptr) {
        MemBlock* newBlock = new MemBlock;
        newBlock->pNext = nullptr;

        //设置内存块的第一个节点位空闲节点链表节点的首节点
        freeNodeHeader = &newBlock->data[0];

        for (int i = 1; i < numOfObject; i++) {
            newBlock->data[i - 1].pNext = &newBlock->data[i];
        }
        newBlock->data[numOfObject - 1].pNext = nullptr;

        //首次申请内存块
        if (memBlockHeader == nullptr) {
            memBlockHeader = newBlock;
            cout << "first malloc the memPool" << endl;
        }
        else {
            // 将新生成的内存块插入内存块链表
            newBlock->pNext = memBlockHeader;
            memBlockHeader = newBlock;
            cout << "rmalloc the memPool" << endl;
        }
    }

    //返回空节点闲链表的第一个节点
    void* freeNode = freeNodeHeader;
    freeNodeHeader = freeNodeHeader->pNext;
    return freeNode;
}

//释放分配的节点
template<int objectSize, int numOfObject>
void MemPool<objectSize, numOfObject>::free(void* p) {
    FreeNode* pNode = (FreeNode*)p;
    pNode->pNext = freeNodeHeader;
    freeNodeHeader = pNode;
    cout << "free a node to freeNodeHeader" << endl;
}
