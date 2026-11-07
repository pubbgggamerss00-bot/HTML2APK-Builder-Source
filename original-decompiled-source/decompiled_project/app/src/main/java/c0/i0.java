package c0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ArrayList arrayList, List list, boolean z10) {
        super(1);
        this.f4397a = arrayList;
        this.f4398b = list;
        this.f4399c = z10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        boolean z10;
        g1.a aVar2 = aVar;
        ArrayList arrayList = this.f4397a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            z10 = this.f4399c;
            if (i10 >= size) {
                break;
            }
            ((m0) arrayList.get(i10)).p(aVar2, z10);
            i10++;
        }
        ?? r02 = this.f4398b;
        int size2 = r02.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((m0) r02.get(i11)).p(aVar2, z10);
        }
        return pg.f0.f21461a;
    }
}
