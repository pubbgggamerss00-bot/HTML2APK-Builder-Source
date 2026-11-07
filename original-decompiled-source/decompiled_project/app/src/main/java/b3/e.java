package b3;

import android.text.TextPaint;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.l2;

/* loaded from: classes.dex */
public final class e {
    public static final long a(float f10, float f11) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = l2.f21719c;
        return jFloatToRawIntBits;
    }

    public static final Exception b(f4.e eVar, String str, Exception exc) throws i4.b {
        if (exc instanceof g4.a) {
            return new g4.a(eVar, str);
        }
        if (exc instanceof g4.c) {
            return new g4.c(eVar, str);
        }
        throw new i4.b();
    }

    public static final Class c(kh.c cVar) {
        r.e(cVar, "<this>");
        Class<?> clsB = ((kotlin.jvm.internal.g) cVar).b();
        r.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class d(kh.c cVar) {
        r.e(cVar, "<this>");
        Class<?> clsB = ((kotlin.jvm.internal.g) cVar).b();
        if (clsB.isPrimitive()) {
            String name = clsB.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsB;
    }

    public static final void e(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
