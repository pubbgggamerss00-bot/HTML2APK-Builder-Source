package q4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.fragment.app.p;
import l0.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f14196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14197b;

    /* renamed from: c, reason: collision with root package name */
    public String f14198c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14199d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14200e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14201f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14202g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14203i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14204j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f14205k;

    /* renamed from: l, reason: collision with root package name */
    public float f14206l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14207m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14208n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14209o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f14210p;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f14211a;

        public a(p pVar) {
            this.f14211a = pVar;
        }

        @Override // l0.f.c
        public final void b(int i6) {
            d.this.f14208n = true;
            this.f14211a.e(i6);
        }

        @Override // l0.f.c
        public final void c(Typeface typeface) {
            d dVar = d.this;
            dVar.f14210p = Typeface.create(typeface, dVar.f14199d);
            dVar.f14208n = true;
            this.f14211a.f(dVar.f14210p, false);
        }
    }

    public d(Context context, int i6) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, f.a.f12953v);
        this.f14206l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f14205k = c.a(context, typedArrayObtainStyledAttributes, 3);
        c.a(context, typedArrayObtainStyledAttributes, 4);
        c.a(context, typedArrayObtainStyledAttributes, 5);
        this.f14199d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f14200e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i7 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f14207m = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
        this.f14197b = typedArrayObtainStyledAttributes.getString(i7);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f14196a = c.a(context, typedArrayObtainStyledAttributes, 6);
        this.f14201f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f14202g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i6, w3.a.f15081w);
        this.f14203i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f14204j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14198c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f14210p;
        int i6 = this.f14199d;
        if (typeface == null && (str = this.f14197b) != null) {
            this.f14210p = Typeface.create(str, i6);
        }
        if (this.f14210p == null) {
            int i7 = this.f14200e;
            if (i7 == 1) {
                this.f14210p = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.f14210p = Typeface.SERIF;
            } else if (i7 != 3) {
                this.f14210p = Typeface.DEFAULT;
            } else {
                this.f14210p = Typeface.MONOSPACE;
            }
            this.f14210p = Typeface.create(this.f14210p, i6);
        }
    }

    public final void b(Context context, p pVar) {
        if (!c(context)) {
            a();
        }
        int i6 = this.f14207m;
        if (i6 == 0) {
            this.f14208n = true;
        }
        if (this.f14208n) {
            pVar.f(this.f14210p, true);
            return;
        }
        try {
            a aVar = new a(pVar);
            ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                l0.f.a(context, i6, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f14208n = true;
            pVar.e(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f14197b, e6);
            this.f14208n = true;
            pVar.e(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        if (this.f14208n) {
            return true;
        }
        int i6 = this.f14207m;
        if (i6 != 0) {
            ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceA = null;
            } else {
                context2 = context;
                typefaceA = l0.f.a(context2, i6, new TypedValue(), 0, null, false, true);
            }
            if (typefaceA != null) {
                this.f14210p = typefaceA;
                this.f14208n = true;
                return true;
            }
            if (!this.f14209o) {
                this.f14209o = true;
                Resources resources = context2.getResources();
                int i7 = this.f14207m;
                if (i7 == 0 || !resources.getResourceTypeName(i7).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f14199d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i7);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), h0.a.f13269b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f14199d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f14210p = typefaceCreate2;
                this.f14208n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, p pVar) {
        e(context, textPaint, pVar);
        ColorStateList colorStateList = this.f14205k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f14196a;
        textPaint.setShadowLayer(this.h, this.f14201f, this.f14202g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, p pVar) {
        Typeface typeface;
        if (c(context) && this.f14208n && (typeface = this.f14210p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f14210p);
        b(context, new e(this, context, textPaint, pVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = f.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i6 = (~typeface.getStyle()) & this.f14199d;
        textPaint.setFakeBoldText((i6 & 1) != 0);
        textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f14206l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(null);
            textPaint.setFontVariationSettings(this.f14198c);
        }
        if (this.f14203i) {
            textPaint.setLetterSpacing(this.f14204j);
        }
    }
}
