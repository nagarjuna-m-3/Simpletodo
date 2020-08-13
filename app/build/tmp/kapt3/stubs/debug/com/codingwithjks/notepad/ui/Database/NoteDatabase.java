package com.codingwithjks.notepad.ui.Database;

import java.lang.System;

@androidx.room.Database(entities = {com.codingwithjks.notepad.ui.Model.Note.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codingwithjks/notepad/ui/Database/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Lcom/codingwithjks/notepad/ui/Dao/NoteDao;", "Companion", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "NoteDatabase";
    @org.jetbrains.annotations.Nullable()
    private static volatile com.codingwithjks.notepad.ui.Database.NoteDatabase instance;
    public static final com.codingwithjks.notepad.ui.Database.NoteDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codingwithjks.notepad.ui.Dao.NoteDao getDao();
    
    public NoteDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/codingwithjks/notepad/ui/Database/NoteDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "instance", "Lcom/codingwithjks/notepad/ui/Database/NoteDatabase;", "getInstance", "()Lcom/codingwithjks/notepad/ui/Database/NoteDatabase;", "setInstance", "(Lcom/codingwithjks/notepad/ui/Database/NoteDatabase;)V", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.codingwithjks.notepad.ui.Database.NoteDatabase getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.codingwithjks.notepad.ui.Database.NoteDatabase p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.codingwithjks.notepad.ui.Database.NoteDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}