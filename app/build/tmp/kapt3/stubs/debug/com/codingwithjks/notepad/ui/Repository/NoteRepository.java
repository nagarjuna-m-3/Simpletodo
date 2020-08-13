package com.codingwithjks.notepad.ui.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/codingwithjks/notepad/ui/Repository/NoteRepository;", "", "()V", "Companion", "app_debug"})
public final class NoteRepository {
    private static com.codingwithjks.notepad.ui.Database.NoteDatabase noteDatabase;
    public static final com.codingwithjks.notepad.ui.Repository.NoteRepository.Companion Companion = null;
    
    public NoteRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/codingwithjks/notepad/ui/Repository/NoteRepository$Companion;", "", "()V", "noteDatabase", "Lcom/codingwithjks/notepad/ui/Database/NoteDatabase;", "delete", "", "context", "Landroid/content/Context;", "note", "Lcom/codingwithjks/notepad/ui/Model/Note;", "getCardData", "Landroidx/lifecycle/LiveData;", "", "initialiseDB", "insert", "search", "data", "", "update", "app_debug"})
    public static final class Companion {
        
        private final com.codingwithjks.notepad.ui.Database.NoteDatabase initialiseDB(android.content.Context context) {
            return null;
        }
        
        public final void insert(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.codingwithjks.notepad.ui.Model.Note note) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.LiveData<java.util.List<com.codingwithjks.notepad.ui.Model.Note>> getCardData(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.codingwithjks.notepad.ui.Model.Note note) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.LiveData<java.util.List<com.codingwithjks.notepad.ui.Model.Note>> search(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String data) {
            return null;
        }
        
        public final void delete(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.codingwithjks.notepad.ui.Model.Note note) {
        }
        
        private Companion() {
            super();
        }
    }
}