package s4;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class k0<T> implements y0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final File f24284a;

    /* renamed from: b, reason: collision with root package name */
    public final b1<T> f24285b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24286c;

    public k0(File file, b1<T> serializer) {
        kotlin.jvm.internal.r.e(serializer, "serializer");
        this.f24284a = file;
        this.f24285b = serializer;
        this.f24286c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [s4.k0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(k0 k0Var, vg.c cVar) {
        j0 j0Var;
        Throwable th2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th3;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.f24275e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                j0Var.f24275e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                j0Var = new j0(k0Var, cVar);
            }
        }
        Object obj = j0Var.f24273c;
        ug.a aVar = ug.a.f29706a;
        ?? r22 = j0Var.f24275e;
        try {
        } catch (FileNotFoundException unused) {
            k0Var = r22;
        }
        if (r22 != 0) {
            if (r22 == 1) {
                fileInputStream2 = j0Var.f24272b;
                r22 = (k0) j0Var.f24271a;
                try {
                    pg.q.b(obj);
                    ah.c.a(fileInputStream2, null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        throw th2;
                    } finally {
                    }
                }
            }
            if (r22 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileInputStream = (Closeable) j0Var.f24271a;
            try {
                pg.q.b(obj);
                ah.c.a(fileInputStream, null);
                return obj;
            } catch (Throwable th5) {
                th2 = th5;
                try {
                    throw th2;
                } finally {
                }
            }
        }
        pg.q.b(obj);
        if (k0Var.f24286c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(k0Var.f24284a);
            try {
                b1<T> b1Var = k0Var.f24285b;
                j0Var.f24271a = k0Var;
                j0Var.f24272b = fileInputStream3;
                j0Var.f24275e = 1;
                v4.b bVarA = b1Var.a(fileInputStream3);
                if (bVarA != aVar) {
                    fileInputStream2 = fileInputStream3;
                    obj = bVarA;
                    ah.c.a(fileInputStream2, null);
                    return obj;
                }
            } catch (Throwable th6) {
                r22 = k0Var;
                fileInputStream2 = fileInputStream3;
                th3 = th6;
                throw th2;
            }
        } catch (FileNotFoundException unused2) {
            File file = k0Var.f24284a;
            b1<T> b1Var2 = k0Var.f24285b;
            if (!file.exists()) {
                return b1Var2.getDefaultValue();
            }
            FileInputStream fileInputStream4 = new FileInputStream(k0Var.f24284a);
            try {
                j0Var.f24271a = fileInputStream4;
                j0Var.f24272b = null;
                j0Var.f24275e = 2;
                v4.b bVarA2 = b1Var2.a(fileInputStream4);
                if (bVarA2 != aVar) {
                    obj = bVarA2;
                    fileInputStream = fileInputStream4;
                    ah.c.a(fileInputStream, null);
                    return obj;
                }
                return aVar;
            } catch (Throwable th7) {
                th2 = th7;
                fileInputStream = fileInputStream4;
                throw th2;
            }
        }
        return aVar;
    }

    @Override // s4.y0
    public final Object a(k1 k1Var) {
        return f(this, k1Var);
    }

    @Override // s4.b
    public final void close() {
        this.f24286c.set(true);
    }
}
