package hf;

import android.util.Log;
import cf.i;
import cf.l;
import cf.n;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import ve.p0;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12996j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final cf.e f12997a;

    /* renamed from: b, reason: collision with root package name */
    public c f12998b;

    /* renamed from: c, reason: collision with root package name */
    public lf.e f12999c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13000d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.f f13001e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f13002f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f13003g;

    /* renamed from: h, reason: collision with root package name */
    public final a f13004h;

    static {
        pf.c cVar = pf.c.f21442b;
        cVar.getClass();
        pf.a aVar = cVar.f21443a;
        float[] fArr = aVar.f21440a;
        pf.b bVar = aVar.f21441b;
        if (bVar == null) {
            fArr.clone();
        } else {
            Arrays.copyOf(fArr, bVar.a());
        }
        try {
            n.i0(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
            n.i0("1");
        } catch (IOException unused) {
        }
    }

    public b() {
        ef.g gVar;
        ef.b bVar = new ef.b(true, false, -1L);
        this.f13002f = new HashSet();
        this.f13003g = new HashSet();
        this.f13004h = new a();
        try {
            gVar = new ef.g(bVar);
        } catch (IOException e10) {
            Log.w("PdfBox-Android", "Error initializing scratch file: " + e10.getMessage() + ". Fall back to main memory usage only.");
            try {
                gVar = new ef.g(new ef.b(true, false, -1L));
            } catch (IOException unused) {
                gVar = null;
            }
        }
        cf.e eVar = new cf.e(gVar);
        this.f12997a = eVar;
        this.f13001e = null;
        cf.d dVar = new cf.d();
        eVar.f5428f = dVar;
        cf.d dVar2 = new cf.d();
        dVar.O0(l.Y1, dVar2);
        l lVar = l.f5532w2;
        dVar2.O0(lVar, l.F);
        dVar2.O0(l.B2, l.g0("1.4"));
        cf.d dVar3 = new cf.d();
        l lVar2 = l.I1;
        dVar2.O0(lVar2, dVar3);
        dVar3.O0(lVar, lVar2);
        dVar3.O0(l.f5477i1, new cf.a());
        dVar3.O0(l.X, i.f5441e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        cf.e eVar = this.f12997a;
        if (eVar.f5431j) {
            return;
        }
        IOException iOExceptionA = ef.a.a(eVar, "COSDocument", null);
        ef.f fVar = this.f13001e;
        if (fVar != null) {
            iOExceptionA = ef.a.a(fVar, "RandomAccessRead pdfSource", iOExceptionA);
        }
        Iterator it = this.f13003g.iterator();
        while (it.hasNext()) {
            iOExceptionA = ef.a.a((p0) it.next(), "TrueTypeFont", iOExceptionA);
        }
        if (iOExceptionA != null) {
            throw iOExceptionA;
        }
    }

    public final c h() {
        if (this.f12998b == null) {
            cf.b bVarV0 = this.f12997a.f5428f.v0(l.Y1);
            if (bVarV0 instanceof cf.d) {
                this.f12998b = new c((cf.d) bVarV0, this);
            } else {
                this.f12998b = new c(this);
            }
        }
        return this.f12998b;
    }

    public final lf.e l() {
        if (this.f12999c == null) {
            cf.e eVar = this.f12997a;
            cf.d dVar = eVar.f5428f;
            if (dVar != null ? dVar.v0(l.f5530w0) instanceof cf.d : false) {
                this.f12999c = new lf.e(eVar.f5428f.l0(l.f5530w0));
            }
        }
        return this.f12999c;
    }

    public final float p() throws NumberFormatException {
        float f10;
        float f11 = this.f12997a.f5424b;
        if (f11 < 1.4f) {
            return f11;
        }
        String strJ0 = h().f13005a.J0(l.B2);
        if (strJ0 != null) {
            try {
                f10 = Float.parseFloat(strJ0);
            } catch (NumberFormatException e10) {
                Log.e("PdfBox-Android", "Can't extract the version number of the document catalog.", e10);
            }
        } else {
            f10 = -1.0f;
        }
        return Math.max(f10, f11);
    }

    public final void z(File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        if (this.f12997a.f5431j) {
            throw new IOException("Cannot save a document which has been closed");
        }
        HashSet hashSet = this.f13002f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((mf.n) it.next()).d();
        }
        hashSet.clear();
        gf.b bVar = new gf.b(bufferedOutputStream);
        try {
            bVar.N(this);
        } finally {
            bVar.close();
        }
    }

    public b(cf.e eVar, ef.c cVar) {
        this.f13002f = new HashSet();
        this.f13003g = new HashSet();
        this.f13004h = new a();
        this.f12997a = eVar;
        this.f13001e = cVar;
    }
}
