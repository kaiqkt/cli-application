package com.github.kaiqkt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2 = {"Lcom/github/kaiqkt/SearchCommand;", "Ljava/lang/Runnable;", "()V", "client", "Lcom/github/kaiqkt/api/HttpRequest;", "getClient", "()Lcom/github/kaiqkt/api/HttpRequest;", "setClient", "(Lcom/github/kaiqkt/api/HttpRequest;)V", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "query", "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "sort", "getSort", "setSort", "tag", "getTag", "setTag", "verbose", "", "getVerbose", "()Z", "setVerbose", "(Z)V", "run", "", "Companion", "trello-cli"})
@picocli.CommandLine.Command(name = "search", description = {"Search questions matching criteria."}, mixinStandardHelpOptions = true)
public final class SearchCommand implements java.lang.Runnable {
    @org.jetbrains.annotations.NotNull()
    @picocli.CommandLine.Option(names = {"-q", "--query"}, description = {"Search phrase."})
    private java.lang.String query = "";
    @org.jetbrains.annotations.NotNull()
    @picocli.CommandLine.Option(names = {"-t", "--tag"}, description = {"Search inside specific tag."})
    private java.lang.String tag = "";
    @picocli.CommandLine.Option(names = {"-n", "--limit"}, description = {"Limit results. Default: 10"})
    private int limit = 10;
    @org.jetbrains.annotations.NotNull()
    @picocli.CommandLine.Option(names = {"-s", "--sort-by"}, description = {"Available values: relevance, votes, creation, activity. Default: relevance."})
    private java.lang.String sort = "relevance";
    @picocli.CommandLine.Option(names = {"--verbose"}, description = {"Print verbose output."})
    private boolean verbose = false;
    @org.jetbrains.annotations.NotNull()
    private com.github.kaiqkt.api.HttpRequest client;
    @org.jetbrains.annotations.NotNull()
    public static final com.github.kaiqkt.SearchCommand.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final void setLimit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSort() {
        return null;
    }
    
    public final void setSort(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getVerbose() {
        return false;
    }
    
    public final void setVerbose(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.kaiqkt.api.HttpRequest getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    com.github.kaiqkt.api.HttpRequest p0) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    public SearchCommand() {
        super();
    }
    
    public static final void main(@org.jetbrains.annotations.NotNull()
    java.lang.String[] args) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/github/kaiqkt/SearchCommand$Companion;", "", "()V", "formatQuestion", "", "question", "Lcom/github/kaiqkt/api/Question;", "main", "", "args", "", "([Ljava/lang/String;)V", "trello-cli"})
    public static final class Companion {
        
        private final java.lang.String formatQuestion(com.github.kaiqkt.api.Question question) {
            return null;
        }
        
        public final void main(@org.jetbrains.annotations.NotNull()
        java.lang.String[] args) {
        }
        
        private Companion() {
            super();
        }
    }
}