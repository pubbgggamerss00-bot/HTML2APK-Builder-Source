package g2;

import com.yalantis.ucrop.view.CropImageView;
import g2.d0;
import x0.x1;
import z0.b;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, int i10) {
        super(0);
        this.f11425a = i10;
        this.f11426b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.f11425a) {
            case 0:
                d0 d0VarA = ((s1) this.f11426b).a();
                i2.e0 e0Var = d0VarA.f11324a;
                if (d0VarA.f11337p != ((b.a) e0Var.B()).f34703a.f34702c) {
                    p.l0<i2.e0, d0.b> l0Var = d0VarA.f11329f;
                    Object[] objArr = l0Var.f20739c;
                    long[] jArr = l0Var.f20737a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j10) < 128) {
                                        ((d0.b) objArr[(i10 << 3) + i12]).f11345d = true;
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 == 8) {
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                    if (!e0Var.D()) {
                        i2.e0.f0(e0Var, false, 7);
                    }
                }
                return pg.f0.f21461a;
            default:
                u0.a0 a0Var = (u0.a0) this.f11426b;
                T value = a0Var.f28952l.getValue();
                if (value != 0) {
                    return value;
                }
                x0.u1 u1Var = a0Var.f28950j;
                x1 x1Var = a0Var.f28947g;
                float floatValue = u1Var.getFloatValue();
                return !Float.isNaN(floatValue) ? a0Var.c(floatValue, CropImageView.DEFAULT_ASPECT_RATIO, x1Var.getValue()) : x1Var.getValue();
        }
    }
}
