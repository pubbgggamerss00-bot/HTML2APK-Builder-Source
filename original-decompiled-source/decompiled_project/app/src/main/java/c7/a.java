package c7;

import androidx.work.impl.model.Dependency;

/* loaded from: classes.dex */
public final class a extends androidx.room.g<Dependency> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, Dependency dependency) {
        Dependency dependency2 = dependency;
        fVar.o(1, dependency2.f3160a);
        fVar.o(2, dependency2.f3161b);
    }
}
