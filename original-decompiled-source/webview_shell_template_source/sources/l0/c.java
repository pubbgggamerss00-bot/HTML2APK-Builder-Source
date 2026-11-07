package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.htmltoapk.template.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13779a = new ThreadLocal<>();

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
        float f6;
        int attributeCount;
        int i6;
        char c7;
        int[] iArr;
        int i7;
        int iA;
        float f7;
        int i8;
        float fCbrt;
        int i9;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z6 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z6 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = h0.a.f13268a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i10, -65281);
                    f6 = !ObtainAttributes.hasValue(z6) ? ObtainAttributes.getFloat(z6, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    char c8 = z6;
                    float f8 = (Build.VERSION.SDK_INT >= 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr5 = new int[attributeCount];
                    i6 = i10;
                    int i12 = i6;
                    while (i6 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i13 = i12 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr5[i12] = attributeNameResource;
                            i12 = i13;
                        }
                        i6++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i12);
                    float f9 = 100.0f;
                    c7 = (f8 >= 0.0f || f8 > 100.0f) ? (char) 0 : c8;
                    if (f6 == 1.0f || c7 != 0) {
                        int iB = e5.i.b((int) ((Color.alpha(color) * f6) + 0.5f), 0, 255);
                        if (c7 == 0) {
                            a aVarA = a.a(color);
                            float f10 = aVarA.f13769a;
                            float f11 = aVarA.f13770b;
                            k kVar = k.f13807k;
                            if (f11 < 1.0d || Math.round(f8) <= 0.0d || Math.round(f8) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i7 = depth2;
                                iA = b.a(f8);
                            } else {
                                float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
                                float f12 = 0.0f;
                                float f13 = f11;
                                char c9 = c8;
                                a aVar = null;
                                while (true) {
                                    if (Math.abs(f12 - f11) >= 0.4f) {
                                        float f14 = 1000.0f;
                                        float f15 = f9;
                                        float f16 = 0.0f;
                                        float f17 = 1000.0f;
                                        a aVar2 = null;
                                        while (true) {
                                            if (Math.abs(f16 - f15) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i7 = depth2;
                                                f7 = f9;
                                                break;
                                            }
                                            f7 = f9;
                                            float f18 = ((f15 - f16) / 2.0f) + f16;
                                            iArr = iArrTrimStateSet;
                                            int iC = a.b(f18, f13, fMin).c(k.f13807k);
                                            float fB = b.b(Color.red(iC));
                                            float fB2 = b.b(Color.green(iC));
                                            float fB3 = b.b(Color.blue(iC));
                                            float[] fArr = b.f13778d[c8];
                                            float f19 = ((fB3 * fArr[2]) + ((fB2 * fArr[c8]) + (fB * fArr[0]))) / f7;
                                            if (f19 <= 0.008856452f) {
                                                fCbrt = f19 * 903.2963f;
                                                i8 = iC;
                                            } else {
                                                i8 = iC;
                                                fCbrt = (((float) Math.cbrt(f19)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f8 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                a aVarA2 = a.a(i8);
                                                a aVarB = a.b(aVarA2.f13771c, aVarA2.f13770b, fMin);
                                                float f20 = aVarA2.f13772d - aVarB.f13772d;
                                                float f21 = aVarA2.f13773e - aVarB.f13773e;
                                                float f22 = aVarA2.f13774f - aVarB.f13774f;
                                                i7 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f22 * f22) + (f21 * f21) + (f20 * f20)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f17 = fPow;
                                                    f14 = fAbs;
                                                    aVar2 = aVarA2;
                                                }
                                            } else {
                                                i7 = depth2;
                                            }
                                            if (f14 == 0.0f && f17 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f8) {
                                                f16 = f18;
                                            } else {
                                                f15 = f18;
                                            }
                                            f9 = f7;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i7;
                                        }
                                        a aVar3 = aVar2;
                                        if (c9 == 0) {
                                            if (aVar3 == null) {
                                                f11 = f13;
                                            } else {
                                                aVar = aVar3;
                                                f12 = f13;
                                            }
                                            f13 = ((f11 - f12) / 2.0f) + f12;
                                            f9 = f7;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i7;
                                        } else {
                                            if (aVar3 != null) {
                                                iA = aVar3.c(kVar);
                                                break;
                                            }
                                            f13 = ((f11 - f12) / 2.0f) + f12;
                                            f9 = f7;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i7;
                                            c9 = 0;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i7 = depth2;
                                        iA = aVar == null ? b.a(f8) : aVar.c(kVar);
                                    }
                                }
                            }
                            color = iA;
                        } else {
                            iArr = iArrTrimStateSet;
                            i7 = depth2;
                        }
                        color = (16777215 & color) | (iB << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i7 = depth2;
                    }
                    i9 = i11 + 1;
                    if (i9 > iArr3.length) {
                        int[] iArr6 = new int[i11 <= 4 ? 8 : i11 * 2];
                        System.arraycopy(iArr3, 0, iArr6, 0, i11);
                        iArr3 = iArr6;
                    }
                    iArr3[i11] = color;
                    if (i9 > iArr2.length) {
                        ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                        System.arraycopy(iArr2, 0, r12, 0, i11);
                        iArr2 = r12;
                    }
                    iArr2[i11] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i11 = i9;
                    z6 = c8;
                    depth2 = i7;
                    i10 = 0;
                    r02 = resources;
                } else {
                    ThreadLocal<TypedValue> threadLocal = f13779a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z6);
                    int i14 = typedValue.type;
                    if (i14 < 28 || i14 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    }
                    if (!ObtainAttributes.hasValue(z6)) {
                    }
                    char c82 = z6;
                    if (Build.VERSION.SDK_INT >= 31) {
                        ObtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr52 = new int[attributeCount];
                        i6 = i10;
                        int i122 = i6;
                        while (i6 < attributeCount) {
                        }
                        int[] iArrTrimStateSet2 = StateSet.trimStateSet(iArr52, i122);
                        float f92 = 100.0f;
                        if (f8 >= 0.0f) {
                            if (f6 == 1.0f) {
                                int iB2 = e5.i.b((int) ((Color.alpha(color) * f6) + 0.5f), 0, 255);
                                if (c7 == 0) {
                                }
                                color = (16777215 & color) | (iB2 << 24);
                                i9 = i11 + 1;
                                if (i9 > iArr3.length) {
                                }
                                iArr3[i11] = color;
                                if (i9 > iArr2.length) {
                                }
                                iArr2[i11] = iArr;
                                iArr2 = iArr2;
                                attributeSet2 = attributeSet;
                                theme2 = theme;
                                i11 = i9;
                                z6 = c82;
                                depth2 = i7;
                                i10 = 0;
                                r02 = resources;
                            }
                        }
                    }
                }
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z6 = z6;
                depth2 = depth2;
                i10 = 0;
            }
        }
        int[] iArr7 = new int[i11];
        int[][] iArr8 = new int[i11][];
        System.arraycopy(iArr3, 0, iArr7, 0, i11);
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        return new ColorStateList(iArr8, iArr7);
    }
}
