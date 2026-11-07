package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class e0 extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
