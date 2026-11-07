package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class g extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
