package u4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.htmltoapk.template.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import u4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f14697a;

    /* renamed from: b, reason: collision with root package name */
    public final k f14698b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f14699c;

    /* renamed from: d, reason: collision with root package name */
    public final k[] f14700d;

    /* renamed from: e, reason: collision with root package name */
    public final p f14701e;

    /* renamed from: f, reason: collision with root package name */
    public final p f14702f;

    /* renamed from: g, reason: collision with root package name */
    public final p f14703g;
    public final p h;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14704a;

        /* renamed from: b, reason: collision with root package name */
        public k f14705b;

        /* renamed from: c, reason: collision with root package name */
        public int[][] f14706c;

        /* renamed from: d, reason: collision with root package name */
        public k[] f14707d;

        /* renamed from: e, reason: collision with root package name */
        public p f14708e;

        /* renamed from: f, reason: collision with root package name */
        public p f14709f;

        /* renamed from: g, reason: collision with root package name */
        public p f14710g;
        public p h;

        public a(k kVar) {
            c();
            a(StateSet.WILD_CARD, kVar);
        }

        public final void a(int[] iArr, k kVar) {
            int i6 = this.f14704a;
            if (i6 == 0 || iArr.length == 0) {
                this.f14705b = kVar;
            }
            int[][] iArr2 = this.f14706c;
            if (i6 >= iArr2.length) {
                int i7 = i6 + 10;
                int[][] iArr3 = new int[i7][];
                System.arraycopy(iArr2, 0, iArr3, 0, i6);
                this.f14706c = iArr3;
                k[] kVarArr = new k[i7];
                System.arraycopy(this.f14707d, 0, kVarArr, 0, i6);
                this.f14707d = kVarArr;
            }
            int[][] iArr4 = this.f14706c;
            int i8 = this.f14704a;
            iArr4[i8] = iArr;
            this.f14707d[i8] = kVar;
            this.f14704a = i8 + 1;
        }

        public final q b() {
            if (this.f14704a == 0) {
                return null;
            }
            return new q(this);
        }

        public final void c() {
            this.f14705b = new k();
            this.f14706c = new int[10][];
            this.f14707d = new k[10];
        }
    }

    public q(a aVar) {
        this.f14697a = aVar.f14704a;
        this.f14698b = aVar.f14705b;
        this.f14699c = aVar.f14706c;
        this.f14700d = aVar.f14707d;
        this.f14701e = aVar.f14708e;
        this.f14702f = aVar.f14709f;
        this.f14703g = aVar.f14710g;
        this.h = aVar.h;
    }

    public static void f(a aVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = w3.a.f15079u;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                u4.a aVar2 = new u4.a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                k kVarA = k.g(contextThemeWrapper.obtainStyledAttributes(w3.a.B), aVar2).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                aVar.a(StateSet.trimStateSet(iArr2, i6), kVarA);
            }
        }
    }

    public static q g(Context context, TypedArray typedArray, int i6) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i6, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a aVar = new a();
        aVar.c();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            aVar.c();
        }
        try {
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
            if (xml.getName().equals("selector")) {
                f(aVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return aVar.b();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // u4.j
    public final k a(float f6) {
        return h().a(f6);
    }

    @Override // u4.j
    public final k b(int[] iArr) {
        int i6;
        int i7;
        int[][] iArr2;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i6 = -1;
            i7 = this.f14697a;
            iArr2 = this.f14699c;
            if (i9 >= i7) {
                i9 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                break;
            }
            i9++;
        }
        if (i9 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i8], iArr3)) {
                    i6 = i8;
                    break;
                }
                i8++;
            }
            i9 = i6;
        }
        k[] kVarArr = this.f14700d;
        p pVar = this.h;
        p pVar2 = this.f14703g;
        p pVar3 = this.f14702f;
        p pVar4 = this.f14701e;
        if (pVar4 == null && pVar3 == null && pVar2 == null && pVar == null) {
            return kVarArr[i9];
        }
        k.a aVarJ = kVarArr[i9].j();
        if (pVar4 != null) {
            aVarJ.f14650e = pVar4.c(iArr);
        }
        if (pVar3 != null) {
            aVarJ.f14651f = pVar3.c(iArr);
        }
        if (pVar2 != null) {
            aVarJ.h = pVar2.c(iArr);
        }
        if (pVar != null) {
            aVarJ.f14652g = pVar.c(iArr);
        }
        return aVarJ.a();
    }

    @Override // u4.j
    public final k c() {
        return h();
    }

    @Override // u4.j
    public final k d(h hVar) {
        return h().d(hVar);
    }

    @Override // u4.j
    public final boolean e() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.f14697a > 1 || ((pVar = this.f14701e) != null && pVar.f14693a > 1) || (((pVar2 = this.f14702f) != null && pVar2.f14693a > 1) || (((pVar3 = this.f14703g) != null && pVar3.f14693a > 1) || ((pVar4 = this.h) != null && pVar4.f14693a > 1)));
    }

    public final k h() {
        k kVar = this.f14698b;
        p pVar = this.h;
        p pVar2 = this.f14703g;
        p pVar3 = this.f14702f;
        p pVar4 = this.f14701e;
        if (pVar4 == null && pVar3 == null && pVar2 == null && pVar == null) {
            return kVar;
        }
        k.a aVarJ = kVar.j();
        if (pVar4 != null) {
            aVarJ.f14650e = pVar4.f14694b;
        }
        if (pVar3 != null) {
            aVarJ.f14651f = pVar3.f14694b;
        }
        if (pVar2 != null) {
            aVarJ.h = pVar2.f14694b;
        }
        if (pVar != null) {
            aVarJ.f14652g = pVar.f14694b;
        }
        return aVarJ.a();
    }

    public final a i() {
        a aVar = new a();
        int i6 = this.f14697a;
        aVar.f14704a = i6;
        aVar.f14705b = this.f14698b;
        int[][] iArr = this.f14699c;
        int[][] iArr2 = new int[iArr.length][];
        aVar.f14706c = iArr2;
        k[] kVarArr = this.f14700d;
        aVar.f14707d = new k[kVarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i6);
        System.arraycopy(kVarArr, 0, aVar.f14707d, 0, aVar.f14704a);
        aVar.f14708e = this.f14701e;
        aVar.f14709f = this.f14702f;
        aVar.f14710g = this.f14703g;
        aVar.h = this.h;
        return aVar;
    }
}
