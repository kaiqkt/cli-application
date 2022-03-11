package com.github.kaiqkt.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/github/kaiqkt/api/HttpRequest;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "stackoverflowApiUrl", "", "search", "Lcom/github/kaiqkt/api/ApiResponse;", "Lcom/github/kaiqkt/api/Question;", "query", "tag", "limit", "", "sort", "trello-cli"})
public final class HttpRequest {
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private final java.lang.String stackoverflowApiUrl = "https://api.stackexchange.com/2.2";
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.kaiqkt.api.ApiResponse<com.github.kaiqkt.api.Question> search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, int limit, @org.jetbrains.annotations.Nullable()
    java.lang.String sort) {
        return null;
    }
    
    public HttpRequest() {
        super();
    }
}