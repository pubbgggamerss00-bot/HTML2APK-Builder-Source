package jf;

import cf.n;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final g f15717b = new g(612.0f, 792.0f, 0);

    /* renamed from: a, reason: collision with root package name */
    public final cf.a f15718a;

    static {
        new g(612.0f, 1008.0f, 0);
        new g(2383.937f, 3370.3938f, 0);
        new g(1683.7795f, 2383.937f, 0);
        new g(1190.5513f, 1683.7795f, 0);
        new g(841.8898f, 1190.5513f, 0);
        new g(595.27563f, 841.8898f, 0);
        new g(419.52756f, 595.27563f, 0);
        new g(297.63782f, 419.52756f, 0);
    }

    public g() {
        this(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f15718a;
    }

    public final float a() {
        return ((n) this.f15718a.i0(0)).g0();
    }

    public final float b() {
        return ((n) this.f15718a.i0(1)).g0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(a());
        sb.append(",");
        sb.append(b());
        sb.append(",");
        cf.a aVar = this.f15718a;
        sb.append(((n) aVar.i0(2)).g0());
        sb.append(",");
        sb.append(((n) aVar.i0(3)).g0());
        sb.append("]");
        return sb.toString();
    }

    public g(float f10, float f11, int i10) {
        cf.a aVar = new cf.a();
        this.f15718a = aVar;
        aVar.g0(new cf.f(CropImageView.DEFAULT_ASPECT_RATIO));
        aVar.g0(new cf.f(CropImageView.DEFAULT_ASPECT_RATIO));
        aVar.g0(new cf.f(f10 + CropImageView.DEFAULT_ASPECT_RATIO));
        aVar.g0(new cf.f(CropImageView.DEFAULT_ASPECT_RATIO + f11));
    }

    public g(cf.a aVar) {
        float[] fArrCopyOf = Arrays.copyOf(aVar.D0(), 4);
        cf.a aVar2 = new cf.a();
        this.f15718a = aVar2;
        aVar2.g0(new cf.f(Math.min(fArrCopyOf[0], fArrCopyOf[2])));
        aVar2.g0(new cf.f(Math.min(fArrCopyOf[1], fArrCopyOf[3])));
        aVar2.g0(new cf.f(Math.max(fArrCopyOf[0], fArrCopyOf[2])));
        aVar2.g0(new cf.f(Math.max(fArrCopyOf[1], fArrCopyOf[3])));
    }
}
