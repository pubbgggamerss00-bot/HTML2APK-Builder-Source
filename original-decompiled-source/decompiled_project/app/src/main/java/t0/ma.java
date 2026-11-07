package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ma extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s3 f26454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.u1 f26457h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g2.t1 f26458j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26459k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f26460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Integer f26461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26462n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Integer f26463p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, s3 s3Var, int i10, int i11, z.u1 u1Var, g2.t1 t1Var, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f26450a = arrayList;
        this.f26451b = arrayList2;
        this.f26452c = arrayList3;
        this.f26453d = arrayList4;
        this.f26454e = s3Var;
        this.f26455f = i10;
        this.f26456g = i11;
        this.f26457h = u1Var;
        this.f26458j = t1Var;
        this.f26459k = i12;
        this.f26460l = i13;
        this.f26461m = num;
        this.f26462n = arrayList5;
        this.f26463p = num2;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        int i10;
        g1.a aVar2 = aVar;
        ArrayList arrayList = this.f26450a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            aVar2.d((g2.g1) arrayList.get(i11), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ArrayList arrayList2 = this.f26451b;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            aVar2.d((g2.g1) arrayList2.get(i12), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ArrayList arrayList3 = this.f26452c;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            i10 = this.f26459k;
            if (i13 >= size3) {
                break;
            }
            g2.g1 g1Var = (g2.g1) arrayList3.get(i13);
            int i14 = (this.f26455f - this.f26456g) / 2;
            g2.t1 t1Var = this.f26458j;
            aVar2.d(g1Var, this.f26457h.a(t1Var, t1Var.getLayoutDirection()) + i14, i10 - this.f26460l, CropImageView.DEFAULT_ASPECT_RATIO);
            i13++;
        }
        ArrayList arrayList4 = this.f26453d;
        int size4 = arrayList4.size();
        for (int i15 = 0; i15 < size4; i15++) {
            g2.g1 g1Var2 = (g2.g1) arrayList4.get(i15);
            Integer num = this.f26461m;
            aVar2.d(g1Var2, 0, i10 - (num != null ? num.intValue() : 0), CropImageView.DEFAULT_ASPECT_RATIO);
        }
        s3 s3Var = this.f26454e;
        if (s3Var != null) {
            ArrayList arrayList5 = this.f26462n;
            int size5 = arrayList5.size();
            for (int i16 = 0; i16 < size5; i16++) {
                g2.g1 g1Var3 = (g2.g1) arrayList5.get(i16);
                int i17 = s3Var.f26937a;
                Integer num2 = this.f26463p;
                kotlin.jvm.internal.r.b(num2);
                aVar2.d(g1Var3, i17, i10 - num2.intValue(), CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        return pg.f0.f21461a;
    }
}
