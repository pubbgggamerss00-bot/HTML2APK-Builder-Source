package l7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import g7.h0;
import g7.i0;
import g7.t;
import j2.y;
import java.io.IOException;
import kotlin.jvm.internal.r;
import l7.k;
import mh.s;
import mh.x;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16759a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16760b;

    public static final class a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            if (r.a(h0Var.f11506c, "android.resource")) {
                return new o(h0Var, mVar);
            }
            return null;
        }
    }

    public o(h0 h0Var, w7.m mVar) {
        this.f16759a = h0Var;
        this.f16760b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numG;
        Drawable drawable;
        h0 h0Var = this.f16759a;
        String str = h0Var.f11507d;
        if (str != null) {
            if (x.A(str)) {
                str = null;
            }
            if (str != null) {
                String str2 = (String) qg.x.K(i0.d(h0Var));
                if (str2 == null || (numG = s.g(str2)) == null) {
                    throw new IllegalStateException("Invalid android.resource URI: " + h0Var);
                }
                int iIntValue = numG.intValue();
                w7.m mVar = this.f16760b;
                Context context = mVar.f31401a;
                Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strA = b8.n.a(typedValue.string.toString());
                if (!r.a(strA, "text/xml")) {
                    return new p(new j7.t(hi.x.b(hi.x.h(resources.openRawResource(iIntValue, new TypedValue()))), mVar.f31406f, new j7.s(str, iIntValue)), strA, j7.f.f15222c);
                }
                if (str.equals(context.getPackageName())) {
                    drawable = i.a.c(context, iIntValue);
                    if (drawable == null) {
                        throw new IllegalStateException(y.a(iIntValue, "Invalid resource ID: ").toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = q3.g.f21890a;
                    drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        throw new IllegalStateException(y.a(iIntValue, "Invalid resource ID: ").toString());
                    }
                }
                Bitmap.Config[] configArr = b8.t.f3682a;
                boolean z10 = (drawable instanceof VectorDrawable) || (drawable instanceof n6.b);
                if (z10) {
                    drawable = new BitmapDrawable(context.getResources(), b8.e.a(drawable, (Bitmap.Config) g7.k.b(mVar, w7.h.f31392b), mVar.f31402b, mVar.f31403c, mVar.f31404d == x7.c.f32186b));
                }
                return new m(g7.s.b(drawable), z10, j7.f.f15222c);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + h0Var);
    }
}
