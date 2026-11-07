package u4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.htmltoapk.template.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f14693a;

    /* renamed from: b, reason: collision with root package name */
    public d f14694b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f14695c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f14696d = new d[10];

    public static p b(d dVar) {
        p pVar = new p();
        pVar.a(StateSet.WILD_CARD, dVar);
        return pVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i6 = this.f14693a;
        if (i6 == 0 || iArr.length == 0) {
            this.f14694b = dVar;
        }
        int[][] iArr2 = this.f14695c;
        if (i6 >= iArr2.length) {
            int i7 = i6 + 10;
            int[][] iArr3 = new int[i7][];
            System.arraycopy(iArr2, 0, iArr3, 0, i6);
            this.f14695c = iArr3;
            d[] dVarArr = new d[i7];
            System.arraycopy(this.f14696d, 0, dVarArr, 0, i6);
            this.f14696d = dVarArr;
        }
        int[][] iArr4 = this.f14695c;
        int i8 = this.f14693a;
        iArr4[i8] = iArr;
        this.f14696d[i8] = dVar;
        this.f14693a = i8 + 1;
    }

    public final d c(int[] iArr) {
        int i6;
        int[][] iArr2 = this.f14695c;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 >= this.f14693a) {
                i8 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f14695c;
            while (true) {
                if (i7 >= this.f14693a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i7], iArr3)) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            i8 = i6;
        }
        return i8 < 0 ? this.f14694b : this.f14696d[i8];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = w3.a.B;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarH = k.h(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i6), dVarH);
            }
        }
    }
}
