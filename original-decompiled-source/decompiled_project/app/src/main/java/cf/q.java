package cf;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class q extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5555a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5556b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.g f5557c;

    /* renamed from: d, reason: collision with root package name */
    public ef.h f5558d;

    public q(ArrayList arrayList, t tVar, ef.e eVar, ef.g gVar) throws IOException {
        super(eVar);
        this.f5555a = arrayList;
        this.f5556b = tVar;
        this.f5557c = gVar;
        if (arrayList.isEmpty()) {
            this.f5558d = null;
        } else {
            gVar.getClass();
            this.f5558d = new ef.h(gVar);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f5555a;
        try {
            if (this.f5558d != null) {
                try {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ef.d dVar = new ef.d(this.f5558d);
                        t tVar = this.f5556b;
                        if (size == 0) {
                            try {
                                df.k kVar = (df.k) arrayList.get(size);
                                OutputStream outputStream = ((FilterOutputStream) this).out;
                                kVar.getClass();
                                tVar.getClass();
                                x xVar = new x();
                                xVar.f5423b = Collections.unmodifiableMap(tVar.f5423b);
                                kVar.c(dVar, outputStream, xVar);
                            } catch (Throwable th2) {
                                dVar.close();
                                throw th2;
                            }
                        } else {
                            ef.g gVar = this.f5557c;
                            gVar.getClass();
                            ef.h hVar = new ef.h(gVar);
                            try {
                                ef.e eVar = new ef.e(hVar);
                                try {
                                    df.k kVar2 = (df.k) arrayList.get(size);
                                    kVar2.getClass();
                                    tVar.getClass();
                                    x xVar2 = new x();
                                    xVar2.f5423b = Collections.unmodifiableMap(tVar.f5423b);
                                    kVar2.c(dVar, eVar, xVar2);
                                    eVar.close();
                                    ef.h hVar2 = this.f5558d;
                                    try {
                                        this.f5558d = hVar;
                                        hVar2.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        hVar = hVar2;
                                        hVar.close();
                                        throw th;
                                    }
                                } finally {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        dVar.close();
                    }
                    this.f5558d.close();
                    this.f5558d = null;
                } catch (Throwable th5) {
                    this.f5558d.close();
                    this.f5558d = null;
                    throw th5;
                }
            }
            super.close();
        } catch (Throwable th6) {
            super.close();
            throw th6;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f5558d == null) {
            super.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ef.h hVar = this.f5558d;
        if (hVar != null) {
            hVar.write(bArr, 0, bArr.length);
        } else {
            super.write(bArr);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ef.h hVar = this.f5558d;
        if (hVar != null) {
            hVar.write(bArr, i10, i11);
        } else {
            super.write(bArr, i10, i11);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ef.h hVar = this.f5558d;
        if (hVar != null) {
            hVar.write(i10);
        } else {
            super.write(i10);
        }
    }
}
