package androidx.activity;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.k implements p5.l<b, d5.j> {
    public final /* synthetic */ OnBackPressedDispatcher s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(1);
        this.s = onBackPressedDispatcher;
    }

    @Override // p5.l
    public final d5.j invoke(b bVar) {
        f0 f0VarPrevious;
        kotlin.jvm.internal.j.e("backEvent", bVar);
        OnBackPressedDispatcher onBackPressedDispatcher = this.s;
        e5.h<f0> hVar = onBackPressedDispatcher.f44b;
        ListIterator<f0> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                f0VarPrevious = null;
                break;
            }
            f0VarPrevious = listIterator.previous();
            if (f0VarPrevious.f63a) {
                break;
            }
        }
        f0 f0Var = f0VarPrevious;
        if (onBackPressedDispatcher.f45c != null) {
            onBackPressedDispatcher.b();
        }
        onBackPressedDispatcher.f45c = f0Var;
        return d5.j.f12745a;
    }
}
