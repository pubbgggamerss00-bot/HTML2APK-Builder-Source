package u4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.htmltoapk.template.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f14711a;

    /* renamed from: b, reason: collision with root package name */
    public a f14712b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f14713c;

    /* renamed from: d, reason: collision with root package name */
    public a[] f14714d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public b f14715a;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f14716a;

        /* renamed from: b, reason: collision with root package name */
        public final float f14717b;

        public b(c cVar, float f6) {
            this.f14716a = cVar;
            this.f14717b = f6;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {
        public static final c s;

        /* renamed from: t, reason: collision with root package name */
        public static final c f14718t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ c[] f14719u;

        static {
            c cVar = new c("PERCENT", 0);
            s = cVar;
            c cVar2 = new c("PIXELS", 1);
            f14718t = cVar2;
            f14719u = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f14719u.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = w3.a.E;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i6 = typedValuePeekValue.type;
                    b bVar = i6 == 5 ? new b(c.f14718t, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics())) : i6 == 6 ? new b(c.s, typedValuePeekValue.getFraction(1.0f, 1.0f)) : null;
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i9 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i7);
                    a aVar = new a();
                    aVar.f14715a = bVar;
                    int i10 = this.f14711a;
                    if (i10 == 0 || iArrTrimStateSet.length == 0) {
                        this.f14712b = aVar;
                    }
                    int[][] iArr3 = this.f14713c;
                    if (i10 >= iArr3.length) {
                        int i11 = i10 + 10;
                        int[][] iArr4 = new int[i11][];
                        System.arraycopy(iArr3, 0, iArr4, 0, i10);
                        this.f14713c = iArr4;
                        a[] aVarArr = new a[i11];
                        System.arraycopy(this.f14714d, 0, aVarArr, 0, i10);
                        this.f14714d = aVarArr;
                    }
                    int[][] iArr5 = this.f14713c;
                    int i12 = this.f14711a;
                    iArr5[i12] = iArrTrimStateSet;
                    this.f14714d[i12] = aVar;
                    this.f14711a = i12 + 1;
                }
            }
        }
    }
}
