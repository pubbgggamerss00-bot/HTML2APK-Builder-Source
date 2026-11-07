package t;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class o0 extends i2.m implements i2.r {

    /* renamed from: s, reason: collision with root package name */
    public final g f25307s;

    /* renamed from: t, reason: collision with root package name */
    public final i0 f25308t;

    /* renamed from: v, reason: collision with root package name */
    public final z.f1 f25309v;

    public o0(c2.y0 y0Var, g gVar, i0 i0Var, z.f1 f1Var) {
        this.f25307s = gVar;
        this.f25308t = i0Var;
        this.f25309v = f1Var;
        T1(y0Var);
    }

    public static boolean W1(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // i2.r
    public final void z(i2.h0 h0Var) {
        boolean zW1;
        char c10;
        long j10;
        s1.a aVar = h0Var.f13901a;
        long jI = aVar.i();
        g gVar = this.f25307s;
        gVar.k(jI);
        if (p1.h.e(aVar.i())) {
            h0Var.z1();
            return;
        }
        h0Var.z1();
        gVar.f25231d.getValue();
        Canvas canvasA = q1.c0.a(aVar.f24173b.a());
        i0 i0Var = this.f25308t;
        boolean zF = i0.f(i0Var.f25258f);
        z.f1 f1Var = this.f25309v;
        if (zF) {
            EdgeEffect edgeEffectC = i0Var.c();
            float f10 = -Float.intBitsToFloat((int) (aVar.i() & BodyPartID.bodyIdMax));
            zW1 = W1(270.0f, (Float.floatToRawIntBits(h0Var.N0(f1Var.b(h0Var.getLayoutDirection()))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32), edgeEffectC, canvasA);
        } else {
            zW1 = false;
        }
        if (i0.f(i0Var.f25256d)) {
            c10 = ' ';
            j10 = 4294967295L;
            zW1 = W1(CropImageView.DEFAULT_ASPECT_RATIO, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(h0Var.N0(f1Var.c()))) & BodyPartID.bodyIdMax), i0Var.e(), canvasA) || zW1;
        } else {
            c10 = ' ';
            j10 = 4294967295L;
        }
        if (i0.f(i0Var.f25259g)) {
            zW1 = W1(90.0f, (((long) Float.floatToRawIntBits(h0Var.N0(f1Var.d(h0Var.getLayoutDirection())) + (-((float) gh.a.b(Float.intBitsToFloat((int) (aVar.i() >> c10))))))) & j10) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << c10), i0Var.d(), canvasA) || zW1;
        }
        if (i0.f(i0Var.f25257e)) {
            EdgeEffect edgeEffectB = i0Var.b();
            zW1 = W1(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (aVar.i() & j10))) + h0Var.N0(f1Var.a()))) & j10) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar.i() >> c10)))) << c10), edgeEffectB, canvasA) || zW1;
        }
        if (zW1) {
            gVar.f();
        }
    }
}
