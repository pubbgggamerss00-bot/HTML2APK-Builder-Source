package q3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import c1.x;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f21874a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth;
        int color;
        float f10;
        int attributeCount;
        int i10;
        char c10;
        int[] iArr;
        int i11;
        int iA;
        float f11;
        int i12;
        float fCbrt;
        int i13;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = n3.a.f18331a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i14, i14);
                int resourceId = ObtainAttributes.getResourceId(i14, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i14, -65281);
                    f10 = !ObtainAttributes.hasValue(z10) ? ObtainAttributes.getFloat(z10, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    char c11 = z10;
                    float f12 = (Build.VERSION.SDK_INT >= 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr5 = new int[attributeCount];
                    i10 = i14;
                    int i16 = i10;
                    while (i10 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i10);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i17 = i16 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i10, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr5[i16] = attributeNameResource;
                            i16 = i17;
                        }
                        i10++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i16);
                    float f13 = 100.0f;
                    c10 = (f12 >= CropImageView.DEFAULT_ASPECT_RATIO || f12 > 100.0f) ? (char) 0 : c11;
                    if (f10 == 1.0f || c10 != 0) {
                        int iE = x.e((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                        if (c10 == 0) {
                            a aVarA = a.a(color);
                            float f14 = aVarA.f21864a;
                            float f15 = aVarA.f21865b;
                            k kVar = k.f21902k;
                            if (f15 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i11 = depth2;
                                iA = b.a(f12);
                            } else {
                                float fMin = f14 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : Math.min(360.0f, f14);
                                float f16 = 0.0f;
                                float f17 = f15;
                                char c12 = c11;
                                a aVar = null;
                                while (true) {
                                    if (Math.abs(f16 - f15) >= 0.4f) {
                                        float f18 = 1000.0f;
                                        float f19 = f13;
                                        float f20 = 0.0f;
                                        float f21 = 1000.0f;
                                        a aVar2 = null;
                                        while (true) {
                                            if (Math.abs(f20 - f19) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i11 = depth2;
                                                f11 = f13;
                                                break;
                                            }
                                            f11 = f13;
                                            float f22 = ((f19 - f20) / 2.0f) + f20;
                                            iArr = iArrTrimStateSet;
                                            int iC = a.b(f22, f17, fMin).c(k.f21902k);
                                            float fB = b.b(Color.red(iC));
                                            float fB2 = b.b(Color.green(iC));
                                            float fB3 = b.b(Color.blue(iC));
                                            float[] fArr = b.f21873d[c11];
                                            float f23 = ((fB3 * fArr[2]) + ((fB2 * fArr[c11]) + (fB * fArr[0]))) / f11;
                                            if (f23 <= 0.008856452f) {
                                                fCbrt = f23 * 903.2963f;
                                                i12 = iC;
                                            } else {
                                                i12 = iC;
                                                fCbrt = (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f12 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                a aVarA2 = a.a(i12);
                                                a aVarB = a.b(aVarA2.f21866c, aVarA2.f21865b, fMin);
                                                float f24 = aVarA2.f21867d - aVarB.f21867d;
                                                float f25 = aVarA2.f21868e - aVarB.f21868e;
                                                float f26 = aVarA2.f21869f - aVarB.f21869f;
                                                i11 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f21 = fPow;
                                                    f18 = fAbs;
                                                    aVar2 = aVarA2;
                                                }
                                            } else {
                                                i11 = depth2;
                                            }
                                            if (f18 == CropImageView.DEFAULT_ASPECT_RATIO && f21 == CropImageView.DEFAULT_ASPECT_RATIO) {
                                                break;
                                            }
                                            if (fCbrt < f12) {
                                                f20 = f22;
                                            } else {
                                                f19 = f22;
                                            }
                                            f13 = f11;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i11;
                                        }
                                        a aVar3 = aVar2;
                                        if (c12 == 0) {
                                            if (aVar3 == null) {
                                                f15 = f17;
                                            } else {
                                                aVar = aVar3;
                                                f16 = f17;
                                            }
                                            f17 = ((f15 - f16) / 2.0f) + f16;
                                            f13 = f11;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i11;
                                        } else {
                                            if (aVar3 != null) {
                                                iA = aVar3.c(kVar);
                                                break;
                                            }
                                            f17 = ((f15 - f16) / 2.0f) + f16;
                                            f13 = f11;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i11;
                                            c12 = 0;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i11 = depth2;
                                        iA = aVar == null ? b.a(f12) : aVar.c(kVar);
                                    }
                                }
                            }
                            color = iA;
                        } else {
                            iArr = iArrTrimStateSet;
                            i11 = depth2;
                        }
                        color = (16777215 & color) | (iE << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i11 = depth2;
                    }
                    i13 = i15 + 1;
                    if (i13 > iArr3.length) {
                        int[] iArr6 = new int[i15 <= 4 ? 8 : i15 * 2];
                        System.arraycopy(iArr3, 0, iArr6, 0, i15);
                        iArr3 = iArr6;
                    }
                    iArr3[i15] = color;
                    if (i13 > iArr2.length) {
                        ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i15 > 4 ? i15 * 2 : 8);
                        System.arraycopy(iArr2, 0, r12, 0, i15);
                        iArr2 = r12;
                    }
                    iArr2[i15] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i15 = i13;
                    z10 = c11;
                    depth2 = i11;
                    i14 = 0;
                    r02 = resources;
                } else {
                    ThreadLocal<TypedValue> threadLocal = f21874a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z10);
                    int i18 = typedValue.type;
                    if (i18 < 28 || i18 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i14, -65281);
                        }
                    }
                    if (!ObtainAttributes.hasValue(z10)) {
                    }
                    char c112 = z10;
                    if (Build.VERSION.SDK_INT >= 31) {
                        ObtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr52 = new int[attributeCount];
                        i10 = i14;
                        int i162 = i10;
                        while (i10 < attributeCount) {
                        }
                        int[] iArrTrimStateSet2 = StateSet.trimStateSet(iArr52, i162);
                        float f132 = 100.0f;
                        if (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            if (f10 == 1.0f) {
                                int iE2 = x.e((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                                if (c10 == 0) {
                                }
                                color = (16777215 & color) | (iE2 << 24);
                                i13 = i15 + 1;
                                if (i13 > iArr3.length) {
                                }
                                iArr3[i15] = color;
                                if (i13 > iArr2.length) {
                                }
                                iArr2[i15] = iArr;
                                iArr2 = iArr2;
                                attributeSet2 = attributeSet;
                                theme2 = theme;
                                i15 = i13;
                                z10 = c112;
                                depth2 = i11;
                                i14 = 0;
                                r02 = resources;
                            }
                        }
                    }
                }
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z10 = z10;
                depth2 = depth2;
                i14 = 0;
            }
        }
        int[] iArr7 = new int[i15];
        int[][] iArr8 = new int[i15][];
        System.arraycopy(iArr3, 0, iArr7, 0, i15);
        System.arraycopy(iArr2, 0, iArr8, 0, i15);
        return new ColorStateList(iArr8, iArr7);
    }
}
