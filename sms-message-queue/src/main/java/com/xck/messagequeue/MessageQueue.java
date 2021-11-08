package com.xck.messagequeue;

import java.util.List;

public interface MessageQueue<T> {

    /**
     * 批量入队
     * @param list
     * @return
     */
    boolean enQueue(List<T> list);

    /**
     * 批量出队
     * @param limit
     * @return
     */
    List<T> outQueue(int limit);
}
