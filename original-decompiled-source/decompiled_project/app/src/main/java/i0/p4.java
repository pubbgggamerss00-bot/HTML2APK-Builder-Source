package i0;

import android.graphics.Matrix;
import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t2.b;

/* loaded from: classes.dex */
public final class p4 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f13503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.c<t2.i> f13504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(n4 n4Var, b.c<t2.i> cVar) {
        super(1);
        this.f13503a = n4Var;
        this.f13504b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(q1.l1 l1Var) {
        t2.h0 h0Var;
        q1.j0 j0VarI;
        q1.l1 l1Var2 = l1Var;
        n4 n4Var = this.f13503a;
        if (((Boolean) new f0.c(n4Var, 1).invoke()).booleanValue() && (h0Var = (t2.h0) n4Var.f13448a.getValue()) != null) {
            t2.l lVar = h0Var.f27820b;
            b.c cVarC = n4.c(this.f13504b, h0Var);
            if (cVarC == null) {
                j0VarI = null;
            } else {
                int i10 = cVarC.f27773c;
                int i11 = cVarC.f27772b;
                j0VarI = h0Var.i(i11, i10);
                p1.e eVarB = h0Var.b(i11);
                long jFloatToRawIntBits = ((Float.floatToRawIntBits(lVar.d(i11) == lVar.d(i10 - 1) ? Math.min(h0Var.b(r5).f21131a, eVarB.f21131a) : CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(eVarB.f21132b) & BodyPartID.bodyIdMax)) ^ (-9223372034707292160L);
                Matrix matrix = j0VarI.f21715d;
                if (matrix == null) {
                    j0VarI.f21715d = new Matrix();
                } else {
                    kotlin.jvm.internal.r.b(matrix);
                    matrix.reset();
                }
                Matrix matrix2 = j0VarI.f21715d;
                kotlin.jvm.internal.r.b(matrix2);
                matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)));
                Path path = j0VarI.f21712a;
                Matrix matrix3 = j0VarI.f21715d;
                kotlin.jvm.internal.r.b(matrix3);
                path.transform(matrix3);
            }
        }
        q4 q4Var = j0VarI != null ? new q4(j0VarI) : null;
        if (q4Var != null) {
            l1Var2.p1(q4Var);
            l1Var2.C(true);
        }
        return pg.f0.f21461a;
    }
}
