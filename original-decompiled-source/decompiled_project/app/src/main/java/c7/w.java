package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class w extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
