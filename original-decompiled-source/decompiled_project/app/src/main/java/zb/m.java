package zb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public e f34928a;

    /* renamed from: b, reason: collision with root package name */
    public e f34929b;

    /* renamed from: c, reason: collision with root package name */
    public e f34930c;

    /* renamed from: d, reason: collision with root package name */
    public e f34931d;

    /* renamed from: e, reason: collision with root package name */
    public d f34932e;

    /* renamed from: f, reason: collision with root package name */
    public d f34933f;

    /* renamed from: g, reason: collision with root package name */
    public d f34934g;

    /* renamed from: h, reason: collision with root package name */
    public d f34935h;

    /* renamed from: i, reason: collision with root package name */
    public g f34936i;

    /* renamed from: j, reason: collision with root package name */
    public g f34937j;

    /* renamed from: k, reason: collision with root package name */
    public g f34938k;

    /* renamed from: l, reason: collision with root package name */
    public g f34939l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public e f34940a = new k();

        /* renamed from: b, reason: collision with root package name */
        public e f34941b = new k();

        /* renamed from: c, reason: collision with root package name */
        public e f34942c = new k();

        /* renamed from: d, reason: collision with root package name */
        public e f34943d = new k();

        /* renamed from: e, reason: collision with root package name */
        public d f34944e = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);

        /* renamed from: f, reason: collision with root package name */
        public d f34945f = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);

        /* renamed from: g, reason: collision with root package name */
        public d f34946g = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);

        /* renamed from: h, reason: collision with root package name */
        public d f34947h = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);

        /* renamed from: i, reason: collision with root package name */
        public g f34948i = new g();

        /* renamed from: j, reason: collision with root package name */
        public g f34949j = new g();

        /* renamed from: k, reason: collision with root package name */
        public g f34950k = new g();

        /* renamed from: l, reason: collision with root package name */
        public g f34951l = new g();

        public final m a() {
            m mVar = new m();
            mVar.f34928a = this.f34940a;
            mVar.f34929b = this.f34941b;
            mVar.f34930c = this.f34942c;
            mVar.f34931d = this.f34943d;
            mVar.f34932e = this.f34944e;
            mVar.f34933f = this.f34945f;
            mVar.f34934g = this.f34946g;
            mVar.f34935h = this.f34947h;
            mVar.f34936i = this.f34948i;
            mVar.f34937j = this.f34949j;
            mVar.f34938k = this.f34950k;
            mVar.f34939l = this.f34951l;
            return mVar;
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        zb.a aVar = new zb.a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18033g, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return c(contextThemeWrapper.obtainStyledAttributes(mb.a.f18035i), aVar);
    }

    public static a c(TypedArray typedArray, zb.a aVar) {
        try {
            int i10 = typedArray.getInt(0, 0);
            int i11 = typedArray.getInt(3, i10);
            int i12 = typedArray.getInt(4, i10);
            int i13 = typedArray.getInt(2, i10);
            int i14 = typedArray.getInt(1, i10);
            d dVarD = d(typedArray, 5, aVar);
            d dVarD2 = d(typedArray, 8, dVarD);
            d dVarD3 = d(typedArray, 9, dVarD);
            d dVarD4 = d(typedArray, 7, dVarD);
            d dVarD5 = d(typedArray, 6, dVarD);
            a aVar2 = new a();
            aVar2.f34940a = i.a(i11);
            aVar2.f34944e = dVarD2;
            aVar2.f34941b = i.a(i12);
            aVar2.f34945f = dVarD3;
            aVar2.f34942c = i.a(i13);
            aVar2.f34946g = dVarD4;
            aVar2.f34943d = i.a(i14);
            aVar2.f34947h = dVarD5;
            return aVar2;
        } finally {
            typedArray.recycle();
        }
    }

    public static d d(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new zb.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    @Override // zb.l
    public final m a(int[] iArr) {
        return this;
    }

    public final boolean e(RectF rectF) {
        boolean z10 = this.f34939l.getClass().equals(g.class) && this.f34937j.getClass().equals(g.class) && this.f34936i.getClass().equals(g.class) && this.f34938k.getClass().equals(g.class);
        float fA = this.f34932e.a(rectF);
        return z10 && ((this.f34933f.a(rectF) > fA ? 1 : (this.f34933f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f34935h.a(rectF) > fA ? 1 : (this.f34935h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f34934g.a(rectF) > fA ? 1 : (this.f34934g.a(rectF) == fA ? 0 : -1)) == 0) && (this.f34929b instanceof k) && (this.f34928a instanceof k) && (this.f34930c instanceof k) && (this.f34931d instanceof k);
    }

    public final a f() {
        a aVar = new a();
        aVar.f34940a = new k();
        aVar.f34941b = new k();
        aVar.f34942c = new k();
        aVar.f34943d = new k();
        aVar.f34944e = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
        aVar.f34945f = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
        aVar.f34946g = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
        aVar.f34947h = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
        aVar.f34948i = new g();
        aVar.f34949j = new g();
        aVar.f34950k = new g();
        new g();
        aVar.f34940a = this.f34928a;
        aVar.f34941b = this.f34929b;
        aVar.f34942c = this.f34930c;
        aVar.f34943d = this.f34931d;
        aVar.f34944e = this.f34932e;
        aVar.f34945f = this.f34933f;
        aVar.f34946g = this.f34934g;
        aVar.f34947h = this.f34935h;
        aVar.f34948i = this.f34936i;
        aVar.f34949j = this.f34937j;
        aVar.f34950k = this.f34938k;
        aVar.f34951l = this.f34939l;
        return aVar;
    }

    public final String toString() {
        return "[" + this.f34932e + ", " + this.f34933f + ", " + this.f34934g + ", " + this.f34935h + "]";
    }
}
