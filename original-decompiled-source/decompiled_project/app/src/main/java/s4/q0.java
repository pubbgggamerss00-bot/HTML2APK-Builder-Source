package s4;

import c9.u1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class q0<T> implements j1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final File f24374a;

    /* renamed from: b, reason: collision with root package name */
    public final b1<T> f24375b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f24376c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f24377d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24378e;

    /* renamed from: f, reason: collision with root package name */
    public final yh.c f24379f;

    public q0(File file, v4.f serializer, v0 coordinator, m0 m0Var) {
        kotlin.jvm.internal.r.e(serializer, "serializer");
        kotlin.jvm.internal.r.e(coordinator, "coordinator");
        this.f24374a = file;
        this.f24375b = serializer;
        this.f24376c = coordinator;
        this.f24377d = m0Var;
        this.f24378e = new AtomicBoolean(false);
        this.f24379f = new yh.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[Catch: all -> 0x0124, IOException -> 0x0126, TRY_ENTER, TryCatch #2 {all -> 0x0124, blocks: (B:44:0x00e4, B:46:0x00ea, B:48:0x00ed, B:53:0x0103, B:54:0x0123, B:59:0x0129, B:62:0x0131, B:71:0x0140, B:73:0x0146, B:74:0x0149, B:69:0x013e, B:68:0x013b, B:33:0x009e, B:34:0x00ba), top: B:83:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131 A[Catch: all -> 0x0124, IOException -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:44:0x00e4, B:46:0x00ea, B:48:0x00ed, B:53:0x0103, B:54:0x0123, B:59:0x0129, B:62:0x0131, B:71:0x0140, B:73:0x0146, B:74:0x0149, B:69:0x013e, B:68:0x013b, B:33:0x009e, B:34:0x00ba), top: B:83:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, yh.a] */
    /* JADX WARN: Type inference failed for: r3v9, types: [eh.p] */
    @Override // s4.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h0 h0Var, vg.c cVar) throws IOException {
        p0 p0Var;
        ?? file;
        q0<T> q0Var;
        yh.a aVar;
        s0 s0Var;
        Throwable th2;
        s0 s0Var2;
        File file2;
        q0<T> q0Var2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i10 = p0Var.f24367g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p0Var.f24367g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p0Var = new p0(this, cVar);
            }
        }
        Object obj = p0Var.f24365e;
        ug.a aVar2 = ug.a.f29706a;
        ?? r32 = p0Var.f24367g;
        boolean z10 = true;
        try {
            try {
            } catch (Throwable th3) {
                r32.l(null);
                throw th3;
            }
        } catch (IOException e10) {
            e = e10;
            file = aVar2;
        }
        try {
            try {
                if (r32 == 0) {
                    pg.q.b(obj);
                    if (this.f24378e.get()) {
                        throw new IllegalStateException("StorageConnection has already been disposed.");
                    }
                    File file3 = this.f24374a;
                    File parentFile = file3.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + file3);
                        }
                    }
                    p0Var.f24361a = this;
                    p0Var.f24362b = h0Var;
                    yh.c cVar2 = this.f24379f;
                    p0Var.f24363c = cVar2;
                    p0Var.f24367g = 1;
                    if (cVar2.h(p0Var) != aVar2) {
                        q0Var = this;
                        aVar = cVar2;
                    }
                    return aVar2;
                }
                if (r32 != 1) {
                    if (r32 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var2 = p0Var.f24364d;
                    file2 = (File) p0Var.f24363c;
                    aVar = (yh.a) p0Var.f24362b;
                    q0Var2 = p0Var.f24361a;
                    try {
                        pg.q.b(obj);
                        pg.f0 f0Var = pg.f0.f21461a;
                        try {
                            s0Var2.close();
                            th = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists()) {
                            try {
                                Files.move(file2.toPath(), q0Var2.f24374a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException unused) {
                                z10 = false;
                            }
                            if (!z10) {
                                throw new IOException("Unable to rename " + file2 + " to " + q0Var2.f24374a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                        }
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        aVar.l(null);
                        return pg.f0.f21461a;
                    } catch (Throwable th5) {
                        th2 = th5;
                        try {
                            s0Var2.close();
                        } catch (Throwable th6) {
                            u1.b(th2, th6);
                        }
                        throw th2;
                    }
                }
                yh.a aVar3 = (yh.a) p0Var.f24363c;
                ?? r33 = (eh.p) p0Var.f24362b;
                q0Var = p0Var.f24361a;
                pg.q.b(obj);
                aVar = aVar3;
                h0Var = r33;
                p0Var.f24361a = q0Var;
                p0Var.f24362b = aVar;
                p0Var.f24363c = file;
                p0Var.f24364d = s0Var;
                p0Var.f24367g = 2;
                if (h0Var.invoke(s0Var, p0Var) != aVar2) {
                    file2 = file;
                    q0Var2 = q0Var;
                    s0Var2 = s0Var;
                    pg.f0 f0Var3 = pg.f0.f21461a;
                    s0Var2.close();
                    th = null;
                    if (th == null) {
                    }
                }
                return aVar2;
            } catch (Throwable th7) {
                th2 = th7;
                s0Var2 = s0Var;
                s0Var2.close();
                throw th2;
            }
            b1<T> serializer = q0Var.f24375b;
            kotlin.jvm.internal.r.e(serializer, "serializer");
            s0Var = new s0(file, serializer);
        } catch (IOException e11) {
            e = e11;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
        file = new File(q0Var.f24374a.getAbsolutePath() + ".tmp");
    }

    @Override // s4.b
    public final void close() {
        this.f24378e.set(true);
        this.f24377d.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [s4.q0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s4.o0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [s4.q0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [s4.k1] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // s4.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(k1 k1Var, vg.c cVar) throws Throwable {
        ?? o0Var;
        Throwable th2;
        k0 k0Var;
        boolean z10;
        q0<T> q0Var;
        if (cVar instanceof o0) {
            o0 o0Var2 = (o0) cVar;
            int i10 = o0Var2.f24356f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                o0Var2.f24356f = i10 - PKIFailureInfo.systemUnavail;
                o0Var = o0Var2;
            } else {
                o0Var = new o0(this, cVar);
            }
        }
        Object obj = o0Var.f24354d;
        ug.a aVar = ug.a.f29706a;
        int i11 = o0Var.f24356f;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k1Var = o0Var.f24353c;
                k0Var = o0Var.f24352b;
                o0Var = o0Var.f24351a;
                try {
                    pg.q.b(obj);
                    q0Var = o0Var;
                    z10 = k1Var;
                    try {
                        k0Var.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (z10) {
                        q0Var.f24379f.l(null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        k0Var.close();
                    } catch (Throwable th5) {
                        u1.b(th2, th5);
                    }
                    throw th2;
                }
            }
            pg.q.b(obj);
            if (this.f24378e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zE = this.f24379f.e();
            try {
                k0 k0Var2 = new k0(this.f24374a, this.f24375b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zE);
                    o0Var.f24351a = this;
                    o0Var.f24352b = k0Var2;
                    o0Var.f24353c = zE;
                    o0Var.f24356f = 1;
                    Object objB = k1Var.b(k0Var2, boolValueOf, o0Var);
                    if (objB == aVar) {
                        return aVar;
                    }
                    obj = objB;
                    z10 = zE;
                    q0Var = this;
                    k0Var = k0Var2;
                    k0Var.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    k1Var = zE;
                    o0Var = this;
                    k0Var = k0Var2;
                    k0Var.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                k1Var = zE;
                o0Var = this;
                if (k1Var != 0) {
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (k1Var != 0) {
                o0Var.f24379f.l(null);
            }
            throw th;
        }
    }

    @Override // s4.j1
    public final v0 e() {
        return this.f24376c;
    }
}
