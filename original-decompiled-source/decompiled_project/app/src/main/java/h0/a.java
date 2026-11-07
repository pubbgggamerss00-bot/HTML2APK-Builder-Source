package h0;

import com.yalantis.ucrop.view.CropImageView;
import f3.r;
import p1.h;
import q1.f2;
import q1.s1;

/* loaded from: classes.dex */
public abstract class a implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final b f12077a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12078b;

    /* renamed from: c, reason: collision with root package name */
    public final b f12079c;

    /* renamed from: d, reason: collision with root package name */
    public final b f12080d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f12077a = bVar;
        this.f12078b = bVar2;
        this.f12079c = bVar3;
        this.f12080d = bVar4;
    }

    public static /* synthetic */ a c(a aVar, c cVar, c cVar2, c cVar3, int i10) {
        b bVar = cVar;
        if ((i10 & 1) != 0) {
            bVar = aVar.f12077a;
        }
        b bVar2 = aVar.f12078b;
        b bVar3 = cVar2;
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f12079c;
        }
        return aVar.b(bVar, bVar2, bVar3, cVar3);
    }

    @Override // q1.f2
    public final s1 a(long j10, r rVar, f3.d dVar) {
        float fA = this.f12077a.a(j10, dVar);
        float fA2 = this.f12078b.a(j10, dVar);
        float fA3 = this.f12079c.a(j10, dVar);
        float fA4 = this.f12080d.a(j10, dVar);
        float fC = h.c(j10);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < CropImageView.DEFAULT_ASPECT_RATIO || fA2 < CropImageView.DEFAULT_ASPECT_RATIO || fA3 < CropImageView.DEFAULT_ASPECT_RATIO || fA4 < CropImageView.DEFAULT_ASPECT_RATIO) {
            y.c.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j10, fA, fA2, fA3, fA4, rVar);
    }

    public abstract e b(b bVar, b bVar2, b bVar3, c cVar);

    public abstract s1 d(long j10, float f10, float f11, float f12, float f13, r rVar);
}
