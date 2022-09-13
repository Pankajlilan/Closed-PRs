package com.pankajlilan.closedprs.presentation.utils;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/pankajlilan/closedprs/presentation/utils/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "peek", "()Ljava/lang/Object;", "app_prodDebug"})
public class Event<T extends java.lang.Object> {
    private final T content = null;
    
    public Event(T content) {
        super();
    }
    
    /**
     * Returns the content, even if it's already been handled.
     */
    public final T peek() {
        return null;
    }
}