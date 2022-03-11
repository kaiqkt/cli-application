package com.github.kaiqkt.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/github/kaiqkt/api/ApiResponse;", "T", "", "()V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "quotaMax", "", "getQuotaMax", "()I", "setQuotaMax", "(I)V", "quotaRemaining", "getQuotaRemaining", "setQuotaRemaining", "toString", "", "trello-cli"})
public final class ApiResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends T> items;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "has_more")
    private boolean hasMore = false;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "quota_max")
    private int quotaMax = 0;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "quota_remaining")
    private int quotaRemaining = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0) {
    }
    
    public final boolean getHasMore() {
        return false;
    }
    
    public final void setHasMore(boolean p0) {
    }
    
    public final int getQuotaMax() {
        return 0;
    }
    
    public final void setQuotaMax(int p0) {
    }
    
    public final int getQuotaRemaining() {
        return 0;
    }
    
    public final void setQuotaRemaining(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiResponse() {
        super();
    }
}