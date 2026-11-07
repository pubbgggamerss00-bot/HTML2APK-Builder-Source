package l0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.htmltoapk.template.u0;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import l0.e;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13795a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f13796b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13797c = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f13798a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f13799b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13800c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f13798a = colorStateList;
            this.f13799b = configuration;
            this.f13800c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f13801a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f13802b;

        public b(Resources resources, Resources.Theme theme) {
            this.f13801a = resources;
            this.f13802b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f13801a.equals(bVar.f13801a) && Objects.equals(this.f13802b, bVar.f13802b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f13801a, this.f13802b);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {
        public final void a(final int i6) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.b(i6);
                }
            });
        }

        public abstract void b(int i6);

        public abstract void c(Typeface typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i6, TypedValue typedValue, int i7, c cVar, boolean z6, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i6) + "\" (" + Integer.toHexString(i6) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i8 = typedValue.assetCookie;
            w.f<String, Typeface> fVar = m0.e.f13862b;
            Typeface typefaceA2 = fVar.a(m0.e.b(resources, i6, string, i8, i7));
            if (typefaceA2 != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new u0(1, cVar, typefaceA2));
                }
                typefaceA = typefaceA2;
            } else if (!z7) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e.a aVarA = e.a(resources.getXml(i6), resources);
                        if (aVarA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (cVar != null) {
                                cVar.a(-3);
                            }
                        } else {
                            typefaceA = m0.e.a(context, aVarA, resources, i6, string, typedValue.assetCookie, i7, cVar, z6);
                        }
                    } else {
                        int i9 = typedValue.assetCookie;
                        Typeface typefaceE = m0.e.f13861a.e(context, resources, i6, string, i7);
                        if (typefaceE != null) {
                            fVar.b(m0.e.b(resources, i6, string, i9, i7), typefaceE);
                        }
                        if (cVar != null) {
                            if (typefaceE != null) {
                                new Handler(Looper.getMainLooper()).post(new u0(1, cVar, typefaceE));
                            } else {
                                cVar.a(-3);
                            }
                        }
                        typefaceA = typefaceE;
                    }
                } catch (IOException e6) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e6);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                    if (typefaceA == null) {
                    }
                    return typefaceA;
                } catch (XmlPullParserException e7) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e7);
                    if (cVar != null) {
                    }
                    if (typefaceA == null) {
                    }
                    return typefaceA;
                }
            }
        } else if (cVar != null) {
            cVar.a(-3);
        }
        if (typefaceA == null || cVar != null || z7) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i6) + " could not be retrieved.");
    }
}
