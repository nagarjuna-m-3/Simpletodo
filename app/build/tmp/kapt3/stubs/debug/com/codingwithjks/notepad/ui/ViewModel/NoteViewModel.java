package com.codingwithjks.notepad.ui.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0011"}, d2 = {"Lcom/codingwithjks/notepad/ui/ViewModel/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "delete", "", "context", "Landroid/content/Context;", "note", "Lcom/codingwithjks/notepad/ui/Model/Note;", "getCardsData", "Landroidx/lifecycle/LiveData;", "", "insert", "search", "data", "", "update", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.codingwithjks.notepad.ui.Model.Note note) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.codingwithjks.notepad.ui.Model.Note>> getCardsData(@org.jetbrains.annotations.NotNull()
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
    
    public NoteViewModel() {
        super();
    }
}