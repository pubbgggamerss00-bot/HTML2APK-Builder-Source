package u4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.activity.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public c0 f14635a = new i();

    /* renamed from: b, reason: collision with root package name */
    public c0 f14636b = new i();

    /* renamed from: c, reason: collision with root package name */
    public c0 f14637c = new i();

    /* renamed from: d, reason: collision with root package name */
    public c0 f14638d = new i();

    /* renamed from: e, reason: collision with root package name */
    public d f14639e = new u4.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f14640f = new u4.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f14641g = new u4.a(0.0f);
    public d h = new u4.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f14642i = new f();

    /* renamed from: j, reason: collision with root package name */
    public f f14643j = new f();

    /* renamed from: k, reason: collision with root package name */
    public f f14644k = new f();

    /* renamed from: l, reason: collision with root package name */
    public f f14645l = new f();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public c0 f14646a = new i();

        /* renamed from: b, reason: collision with root package name */
        public c0 f14647b = new i();

        /* renamed from: c, reason: collision with root package name */
        public c0 f14648c = new i();

        /* renamed from: d, reason: collision with root package name */
        public c0 f14649d = new i();

        /* renamed from: e, reason: collision with root package name */
        public d f14650e = new u4.a(0.0f);

        /* renamed from: f, reason: collision with root package name */
        public d f14651f = new u4.a(0.0f);

        /* renamed from: g, reason: collision with root package name */
        public d f14652g = new u4.a(0.0f);
        public d h = new u4.a(0.0f);

        /* renamed from: i, reason: collision with root package name */
        public f f14653i = new f();

        /* renamed from: j, reason: collision with root package name */
        public f f14654j = new f();

        /* renamed from: k, reason: collision with root package name */
        public f f14655k = new f();

        /* renamed from: l, reason: collision with root package name */
        public f f14656l = new f();

        public final k a() {
            k kVar = new k();
            kVar.f14635a = this.f14646a;
            kVar.f14636b = this.f14647b;
            kVar.f14637c = this.f14648c;
            kVar.f14638d = this.f14649d;
            kVar.f14639e = this.f14650e;
            kVar.f14640f = this.f14651f;
            kVar.f14641g = this.f14652g;
            kVar.h = this.h;
            kVar.f14642i = this.f14653i;
            kVar.f14643j = this.f14654j;
            kVar.f14644k = this.f14655k;
            kVar.f14645l = this.f14656l;
            return kVar;
        }
    }

    public static a f(Context context, AttributeSet attributeSet, int i6, int i7) {
        u4.a aVar = new u4.a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15079u, i6, i7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return g(contextThemeWrapper.obtainStyledAttributes(w3.a.B), aVar);
    }

    public static a g(TypedArray typedArray, u4.a aVar) {
        try {
            int i6 = typedArray.getInt(0, 0);
            int i7 = typedArray.getInt(3, i6);
            int i8 = typedArray.getInt(4, i6);
            int i9 = typedArray.getInt(2, i6);
            int i10 = typedArray.getInt(1, i6);
            d dVarH = h(typedArray, 5, aVar);
            d dVarH2 = h(typedArray, 8, dVarH);
            d dVarH3 = h(typedArray, 9, dVarH);
            d dVarH4 = h(typedArray, 7, dVarH);
            d dVarH5 = h(typedArray, 6, dVarH);
            a aVar2 = new a();
            aVar2.f14646a = a1.a.d(i7);
            aVar2.f14650e = dVarH2;
            aVar2.f14647b = a1.a.d(i8);
            aVar2.f14651f = dVarH3;
            aVar2.f14648c = a1.a.d(i9);
            aVar2.f14652g = dVarH4;
            aVar2.f14649d = a1.a.d(i10);
            aVar2.h = dVarH5;
            return aVar2;
        } finally {
            typedArray.recycle();
        }
    }

    public static d h(TypedArray typedArray, int i6, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i6);
        if (typedValuePeekValue != null) {
            int i7 = typedValuePeekValue.type;
            if (i7 == 5) {
                return new u4.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i7 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    @Override // u4.j
    public final k a(float f6) {
        a aVarJ = j();
        aVarJ.getClass();
        aVarJ.f14650e = new u4.a(f6);
        aVarJ.f14651f = new u4.a(f6);
        aVarJ.f14652g = new u4.a(f6);
        aVarJ.h = new u4.a(f6);
        return aVarJ.a();
    }

    @Override // u4.j
    public final k d(h hVar) {
        a aVarJ = j();
        aVarJ.f14650e = hVar;
        aVarJ.f14651f = hVar;
        aVarJ.f14652g = hVar;
        aVarJ.h = hVar;
        return aVarJ.a();
    }

    @Override // u4.j
    public final boolean e() {
        return false;
    }

    public final boolean i(RectF rectF) {
        boolean z6 = this.f14645l.getClass().equals(f.class) && this.f14643j.getClass().equals(f.class) && this.f14642i.getClass().equals(f.class) && this.f14644k.getClass().equals(f.class);
        float fA = this.f14639e.a(rectF);
        return z6 && ((this.f14640f.a(rectF) > fA ? 1 : (this.f14640f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14641g.a(rectF) > fA ? 1 : (this.f14641g.a(rectF) == fA ? 0 : -1)) == 0) && (this.f14636b instanceof i) && (this.f14635a instanceof i) && (this.f14637c instanceof i) && (this.f14638d instanceof i);
    }

    public final a j() {
        a aVar = new a();
        aVar.f14646a = new i();
        aVar.f14647b = new i();
        aVar.f14648c = new i();
        aVar.f14649d = new i();
        aVar.f14650e = new u4.a(0.0f);
        aVar.f14651f = new u4.a(0.0f);
        aVar.f14652g = new u4.a(0.0f);
        aVar.h = new u4.a(0.0f);
        aVar.f14653i = new f();
        aVar.f14654j = new f();
        aVar.f14655k = new f();
        new f();
        aVar.f14646a = this.f14635a;
        aVar.f14647b = this.f14636b;
        aVar.f14648c = this.f14637c;
        aVar.f14649d = this.f14638d;
        aVar.f14650e = this.f14639e;
        aVar.f14651f = this.f14640f;
        aVar.f14652g = this.f14641g;
        aVar.h = this.h;
        aVar.f14653i = this.f14642i;
        aVar.f14654j = this.f14643j;
        aVar.f14655k = this.f14644k;
        aVar.f14656l = this.f14645l;
        return aVar;
    }

    public final String toString() {
        return "[" + this.f14639e + ", " + this.f14640f + ", " + this.f14641g + ", " + this.h + "]";
    }

    @Override // u4.j
    public final k c() {
        return this;
    }

    @Override // u4.j
    public final k b(int[] iArr) {
        return this;
    }
}
