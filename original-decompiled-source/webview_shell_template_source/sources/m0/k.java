package m0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements b<r0.l> {
        @Override // m0.k.b
        public final int a(r0.l lVar) {
            return lVar.f14250c;
        }

        @Override // m0.k.b
        public final boolean b(r0.l lVar) {
            return lVar.f14251d;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b<T> {
        int a(T t6);

        boolean b(T t6);
    }

    public k() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i6) {
        throw null;
    }

    public Typeface b(Context context, r0.l[] lVarArr, int i6) {
        throw null;
    }

    public Typeface c(Context context, List list, int i6) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileD = l.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (l.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i6, String str, int i7) {
        File fileD = l.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (l.b(fileD, resources, i6)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public r0.l f(r0.l[] lVarArr, int i6) {
        a aVar = new a();
        int i7 = (i6 & 1) == 0 ? 400 : 700;
        boolean z6 = (i6 & 2) != 0;
        r0.l lVar = null;
        int i8 = Integer.MAX_VALUE;
        for (r0.l lVar2 : lVarArr) {
            int iAbs = (Math.abs(aVar.a(lVar2) - i7) * 2) + (aVar.b(lVar2) == z6 ? 0 : 1);
            if (lVar == null || i8 > iAbs) {
                lVar = lVar2;
                i8 = iAbs;
            }
        }
        return lVar;
    }
}
