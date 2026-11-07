package c0;

import c0.v0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.s implements eh.l<Integer, ArrayList<pg.n<? extends Integer, ? extends f3.b>>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f4356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f4357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(v0 v0Var, b0 b0Var) {
        super(1);
        this.f4356a = v0Var;
        this.f4357b = b0Var;
    }

    @Override // eh.l
    public final ArrayList<pg.n<? extends Integer, ? extends f3.b>> invoke(Integer num) {
        v0.c cVarB = this.f4356a.b(num.intValue());
        int i10 = cVarB.f4500a;
        List<c> list = cVarB.f4501b;
        ArrayList<pg.n<? extends Integer, ? extends f3.b>> arrayList = new ArrayList<>(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = (int) list.get(i12).f4355a;
            arrayList.add(new pg.n<>(Integer.valueOf(i10), new f3.b(this.f4357b.a(i11, i13))));
            i10++;
            i11 += i13;
        }
        return arrayList;
    }
}
