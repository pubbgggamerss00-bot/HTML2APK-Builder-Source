package ah;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes2.dex */
public final class h implements lh.g<File> {

    /* renamed from: a, reason: collision with root package name */
    public final File f567a;

    /* renamed from: b, reason: collision with root package name */
    public final i f568b;

    /* renamed from: c, reason: collision with root package name */
    public final eh.p<File, IOException, f0> f569c;

    public static abstract class a extends c {
    }

    public final class b extends qg.b<File> {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque<c> f570c;

        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f572b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f573c;

            /* renamed from: d, reason: collision with root package name */
            public int f574d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f575e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f576f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                r.e(rootDir, "rootDir");
                this.f576f = bVar;
            }

            @Override // ah.h.c
            public final File a() {
                boolean z10 = this.f575e;
                File file = this.f582a;
                if (!z10 && this.f573c == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f573c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        eh.p<File, IOException, f0> pVar = h.this.f569c;
                        if (pVar != null) {
                            pVar.invoke(file, new ah.a(file));
                        }
                        this.f575e = true;
                    }
                }
                File[] fileArr = this.f573c;
                if (fileArr == null || this.f574d >= fileArr.length) {
                    if (this.f572b) {
                        return null;
                    }
                    this.f572b = true;
                    return file;
                }
                r.b(fileArr);
                int i10 = this.f574d;
                this.f574d = i10 + 1;
                return fileArr[i10];
            }
        }

        /* renamed from: ah.h$b$b, reason: collision with other inner class name */
        public final class C0006b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f577b;

            @Override // ah.h.c
            public final File a() {
                if (this.f577b) {
                    return null;
                }
                this.f577b = true;
                return this.f582a;
            }
        }

        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f578b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f579c;

            /* renamed from: d, reason: collision with root package name */
            public int f580d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f581e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                r.e(rootDir, "rootDir");
                this.f581e = bVar;
            }

            @Override // ah.h.c
            public final File a() {
                eh.p<File, IOException, f0> pVar;
                boolean z10 = this.f578b;
                File file = this.f582a;
                if (!z10) {
                    this.f578b = true;
                    return file;
                }
                File[] fileArr = this.f579c;
                if (fileArr != null && this.f580d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f579c = fileArrListFiles;
                    if (fileArrListFiles == null && (pVar = h.this.f569c) != null) {
                        pVar.invoke(file, new ah.a(file));
                    }
                    File[] fileArr2 = this.f579c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        return null;
                    }
                }
                File[] fileArr3 = this.f579c;
                r.b(fileArr3);
                int i10 = this.f580d;
                this.f580d = i10 + 1;
                return fileArr3[i10];
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f570c = arrayDeque;
            File rootFile = h.this.f567a;
            if (rootFile.isDirectory()) {
                arrayDeque.push(e(rootFile));
            } else if (!rootFile.isFile()) {
                this.f22709a = 2;
            } else {
                r.e(rootFile, "rootFile");
                arrayDeque.push(new C0006b(rootFile));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qg.b
        public final void c() {
            T t3;
            File fileA;
            while (true) {
                ArrayDeque<c> arrayDeque = this.f570c;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t3 = 0;
                    break;
                }
                fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else if (fileA.equals(cVarPeek.f582a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(e(fileA));
                }
            }
            t3 = fileA;
            if (t3 == 0) {
                this.f22709a = 2;
            } else {
                this.f22710b = t3;
                this.f22709a = 1;
            }
        }

        public final a e(File file) {
            int iOrdinal = h.this.f568b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            throw new pg.l();
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f582a;

        public c(File root) {
            r.e(root, "root");
            this.f582a = root;
        }

        public abstract File a();
    }

    public h(File file, i iVar, j jVar) {
        this.f567a = file;
        this.f568b = iVar;
        this.f569c = jVar;
    }

    @Override // lh.g
    public final Iterator<File> iterator() {
        return new b();
    }
}
