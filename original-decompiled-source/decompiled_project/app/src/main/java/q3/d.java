package q3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.AndroidManifestAttrs;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f21875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21876b;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f21875a = shader;
        this.f21876b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f21888a;
        r0 = r0.f21889b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f21888a, r0.f21889b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= com.yalantis.ucrop.view.CropImageView.DEFAULT_ASPECT_RATIO) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f21888a;
        r0 = r0.f21889b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new q3.d(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new q3.f(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new q3.f(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new q3.f(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        int color;
        float f11;
        int i11;
        float f12;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayC = j.c(resources, theme, attributeSetAsAttributeSet, n3.a.f18335e);
        float f13 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "startX") != null ? typedArrayC.getFloat(8, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f14 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "startY") != null ? typedArrayC.getFloat(9, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f15 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "endX") != null ? typedArrayC.getFloat(10, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f16 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "endY") != null ? typedArrayC.getFloat(11, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f17 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "centerX") != null ? typedArrayC.getFloat(3, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f18 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "centerY") != null ? typedArrayC.getFloat(4, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        int i12 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "type") != null ? typedArrayC.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "startColor") != null ? typedArrayC.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "centerColor") != null;
        int color3 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "centerColor") != null ? typedArrayC.getColor(7, 0) : 0;
        if (xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "endColor") != null) {
            f10 = f13;
            color = typedArrayC.getColor(1, 0);
        } else {
            f10 = f13;
            color = 0;
        }
        if (xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "tileMode") != null) {
            f11 = f14;
            i11 = typedArrayC.getInt(6, 0);
        } else {
            f11 = f14;
            i11 = 0;
        }
        float f19 = xml.getAttributeValue(AndroidManifestAttrs.NAMESPACE, "gradientRadius") != null ? typedArrayC.getFloat(5, CropImageView.DEFAULT_ASPECT_RATIO) : CropImageView.DEFAULT_ASPECT_RATIO;
        typedArrayC.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f20 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f21 = f15;
            if (next2 == 1) {
                f12 = f16;
                break;
            }
            int depth2 = xml.getDepth();
            f12 = f16;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayC2 = j.c(resources, theme, attributeSetAsAttributeSet, n3.a.f18336f);
                boolean zHasValue = typedArrayC2.hasValue(0);
                boolean zHasValue2 = typedArrayC2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayC2.getColor(0, 0);
                float f22 = typedArrayC2.getFloat(1, CropImageView.DEFAULT_ASPECT_RATIO);
                typedArrayC2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f22));
            }
            f15 = f21;
            f16 = f12;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }
}
