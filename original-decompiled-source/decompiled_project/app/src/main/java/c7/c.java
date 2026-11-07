package c7;

import androidx.work.impl.model.Preference;

/* loaded from: classes.dex */
public final class c extends androidx.room.g<Preference> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, Preference preference) {
        Preference preference2 = preference;
        fVar.o(1, preference2.f3162a);
        fVar.d(2, preference2.f3163b.longValue());
    }
}
