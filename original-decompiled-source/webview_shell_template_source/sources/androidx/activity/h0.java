package androidx.activity;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.k implements p5.l, p5.p {
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(1);
        this.s = onBackPressedDispatcher;
    }

    @Override // p5.p
    public Object b(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Number) obj2).intValue();
        kotlin.jvm.internal.j.e("$this$$receiver", charSequence);
        int iU = x5.o.u(charSequence, (char[]) this.s, iIntValue, false);
        if (iU < 0) {
            return null;
        }
        return new d5.c(Integer.valueOf(iU), 1);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        f0 f0VarPrevious;
        kotlin.jvm.internal.j.e("backEvent", (b) obj);
        OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.s;
        if (onBackPressedDispatcher.f45c == null) {
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
        }
        return d5.j.f12745a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(char[] cArr) {
        super(2);
        this.s = cArr;
    }
}
