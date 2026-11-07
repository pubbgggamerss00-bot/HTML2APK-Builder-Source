package x8;

import ah.h;
import ah.h.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipOutputStream;
import pg.p;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsZip$1", f = "HomeViewModel.kt", l = {537, 606}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public j6 f33398a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f33399b;

    /* renamed from: c, reason: collision with root package name */
    public File f33400c;

    /* renamed from: d, reason: collision with root package name */
    public int f33401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f33402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f33403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f33404g;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsZip$1$1", f = "HomeViewModel.kt", l = {538}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f33405a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j6 f33406b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f33407c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f33408d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsZip$1$1$1", f = "HomeViewModel.kt", l = {548}, m = "invokeSuspend")
        /* renamed from: x8.y6$a$a, reason: collision with other inner class name */
        public static final class C0335a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public List f33409a;

            /* renamed from: b, reason: collision with root package name */
            public File f33410b;

            /* renamed from: c, reason: collision with root package name */
            public j6 f33411c;

            /* renamed from: d, reason: collision with root package name */
            public Map f33412d;

            /* renamed from: e, reason: collision with root package name */
            public Iterator f33413e;

            /* renamed from: f, reason: collision with root package name */
            public Map f33414f;

            /* renamed from: g, reason: collision with root package name */
            public Long f33415g;

            /* renamed from: h, reason: collision with root package name */
            public long f33416h;

            /* renamed from: j, reason: collision with root package name */
            public int f33417j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f33418k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ j6 f33419l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Context f33420m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ boolean f33421n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0335a(j6 j6Var, Context context, boolean z10, tg.e<? super C0335a> eVar) {
                super(2, eVar);
                this.f33419l = j6Var;
                this.f33420m = context;
                this.f33421n = z10;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0335a c0335a = new C0335a(this.f33419l, this.f33420m, this.f33421n, eVar);
                c0335a.f33418k = obj;
                return c0335a;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
                return ((C0335a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(20:24|(1:119)|25|132|26|27|28|29|30|128|31|117|32|33|130|34|35|126|36|(1:38)(8:39|40|59|(0)|62|64|20|(9:65|67|123|68|(4:72|(8:74|(2:76|(1:92)(3:78|79|(4:81|(4:84|(2:86|141)(2:89|140)|90|82)|139|92)(1:91)))(0)|93|(2:95|(1:97))|98|(2:100|(1:102))|(2:104|137)(1:138)|105)(3:136|106|107)|69|70)|135|108|109|110)(0))) */
            /* JADX WARN: Can't wrap try/catch for region: R(20:24|119|25|132|26|27|28|29|30|128|31|117|32|33|130|34|35|126|36|(1:38)(8:39|40|59|(0)|62|64|20|(9:65|67|123|68|(4:72|(8:74|(2:76|(1:92)(3:78|79|(4:81|(4:84|(2:86|141)(2:89|140)|90|82)|139|92)(1:91)))(0)|93|(2:95|(1:97))|98|(2:100|(1:102))|(2:104|137)(1:138)|105)(3:136|106|107)|69|70)|135|108|109|110)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
            
                r18 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
            
                r21 = r18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
            
                r13 = r11;
                r5 = r18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
            
                r10 = r20;
                r8 = r21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
            
                r21 = r18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
            
                r13 = r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
            
                r20 = r9;
                r17 = r10;
                r21 = r18;
                r18 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
            
                r0 = pg.q.a(r0);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x016d A[Catch: all -> 0x024a, TRY_ENTER, TryCatch #3 {all -> 0x024a, blocks: (B:68:0x0160, B:69:0x0165, B:72:0x016d, B:74:0x0175, B:76:0x01eb, B:78:0x01f6, B:81:0x01fe, B:82:0x0207, B:84:0x020d, B:86:0x0219, B:91:0x025b, B:93:0x0281, B:95:0x0287, B:97:0x0292, B:98:0x02ad, B:100:0x02b3, B:102:0x02be, B:104:0x02db, B:106:0x02fa, B:107:0x02ff, B:108:0x0300), top: B:123:0x0160 }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x027b A[PHI: r2 r5 r8
              0x027b: PHI (r2v7 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v13 java.lang.String) binds: [B:75:0x01e9, B:77:0x01f4, B:139:0x027b] A[DONT_GENERATE, DONT_INLINE]
              0x027b: PHI (r5v9 java.util.Iterator) = (r5v8 java.util.Iterator), (r5v8 java.util.Iterator), (r5v13 java.util.Iterator) binds: [B:75:0x01e9, B:77:0x01f4, B:139:0x027b] A[DONT_GENERATE, DONT_INLINE]
              0x027b: PHI (r8v14 com.basitce.htmltoapk.data.local.entity.ProjectEntity) = 
              (r8v13 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
              (r8v13 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
              (r8v17 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
             binds: [B:75:0x01e9, B:77:0x01f4, B:139:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v10 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v9 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f2 -> B:40:0x00f9). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0134 -> B:64:0x0142). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws IOException {
                List<ProjectEntity> list;
                File file;
                long jCurrentTimeMillis;
                qg.a0 a0Var;
                j6 j6Var;
                File file2;
                ph.i0 i0Var;
                Map linkedHashMap;
                Iterator it;
                long j10;
                Object objA;
                ZipOutputStream zipOutputStream;
                Iterator it2;
                String str;
                Iterator it3;
                ProjectEntity projectEntity;
                String str2;
                Iterator it4;
                ProjectEntity projectEntity2;
                Long l10;
                long j11;
                Object objE;
                String str3 = "_";
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f33417j;
                Context context = this.f33420m;
                j6 j6Var2 = this.f33419l;
                if (i10 == 0) {
                    pg.q.b(obj);
                    ph.i0 i0Var2 = (ph.i0) this.f33418k;
                    list = ((m0) j6Var2.f32783j.f25021a.getValue()).f32924a;
                    if (list.isEmpty()) {
                        throw new IllegalStateException(j6Var2.F().getString(R.string.home_export_error));
                    }
                    File file3 = new File(context.getFilesDir(), "exports");
                    file3.mkdirs();
                    file = new File(file3, "htmltoapk_all_projects.zip");
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (!this.f33421n) {
                        a0Var = qg.a0.f22708a;
                        zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                        it2 = list.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                        }
                        byte[] bytes = String.valueOf(jCurrentTimeMillis).getBytes(mh.a.f18238b);
                        kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                        uh.t.a(zipOutputStream, "exported_at.txt", bytes);
                        pg.f0 f0Var = pg.f0.f21461a;
                        zipOutputStream.close();
                        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("application/zip");
                        intent.putExtra("android.intent.extra.STREAM", uriForFile);
                        intent.addFlags(1);
                        return new pg.n(intent, file);
                    }
                    int iA = qg.j0.a(qg.p.h(list, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    j6Var = j6Var2;
                    file2 = file;
                    i0Var = i0Var2;
                    linkedHashMap = new LinkedHashMap(iA);
                    it = list.iterator();
                    j10 = jCurrentTimeMillis;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = this.f33416h;
                    Long l11 = this.f33415g;
                    linkedHashMap = this.f33414f;
                    it = this.f33413e;
                    Map map = this.f33412d;
                    j6Var = this.f33411c;
                    file2 = this.f33410b;
                    list = this.f33409a;
                    ph.i0 i0Var3 = (ph.i0) this.f33418k;
                    try {
                        pg.q.b(obj);
                        objE = obj;
                        linkedHashMap = linkedHashMap;
                    } catch (Throwable th2) {
                        objA = pg.q.a(th2);
                    }
                    objA = (KeystoreEntity) objE;
                    if (objA instanceof p.a) {
                        objA = null;
                    }
                    KeystoreEntity keystoreEntity = (KeystoreEntity) objA;
                    Map map2 = linkedHashMap;
                    map2.put(l11, keystoreEntity);
                    linkedHashMap = map;
                    i0Var = i0Var3;
                    if (it.hasNext()) {
                        ProjectEntity projectEntity3 = (ProjectEntity) it.next();
                        long j12 = j10;
                        Long l12 = new Long(projectEntity3.getId());
                        Long keystoreId = projectEntity3.getKeystoreId();
                        if (keystoreId != null) {
                            long jLongValue = keystoreId.longValue();
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                                l10 = l12;
                                i0Var3 = i0Var;
                                j11 = j12;
                            }
                            n8.l lVar = j6Var.f32776c;
                            this.f33418k = i0Var;
                            this.f33409a = list;
                            this.f33410b = file2;
                            this.f33411c = j6Var;
                            this.f33412d = linkedHashMap;
                            this.f33413e = it;
                            this.f33414f = linkedHashMap;
                            this.f33415g = l12;
                            l10 = l12;
                            i0Var3 = i0Var;
                            this.f33416h = j12;
                            this.f33417j = 1;
                            lVar.getClass();
                            wh.c cVar = ph.z0.f21632a;
                            List<ProjectEntity> list2 = list;
                            j11 = j12;
                            objE = ph.h.e(wh.b.f31563c, new n8.m(lVar, jLongValue, null), this);
                            if (objE == aVar) {
                                return aVar;
                            }
                            map = linkedHashMap;
                            list = list2;
                            l11 = l10;
                            j10 = j11;
                            linkedHashMap = linkedHashMap;
                            objA = (KeystoreEntity) objE;
                            if (objA instanceof p.a) {
                            }
                            KeystoreEntity keystoreEntity2 = (KeystoreEntity) objA;
                            Map map22 = linkedHashMap;
                            map22.put(l11, keystoreEntity2);
                            linkedHashMap = map;
                            i0Var = i0Var3;
                            if (it.hasNext()) {
                                a0Var = linkedHashMap;
                                file = file2;
                                jCurrentTimeMillis = j10;
                                zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                                try {
                                    it2 = list.iterator();
                                    int i112 = 0;
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i12 = i112 + 1;
                                        if (i112 < 0) {
                                            qg.p.o();
                                            throw null;
                                        }
                                        ProjectEntity projectEntity4 = (ProjectEntity) next;
                                        String input = projectEntity4.getName();
                                        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                                        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                                        kotlin.jvm.internal.r.e(input, "input");
                                        String strReplaceAll = patternCompile.matcher(input).replaceAll(str3);
                                        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                                        String str4 = "project_" + i12 + str3 + strReplaceAll;
                                        KeystoreEntity keystoreEntity3 = (KeystoreEntity) a0Var.get(new Long(projectEntity4.getId()));
                                        kotlinx.serialization.json.v vVarG = j6.g(j6Var2, projectEntity4, keystoreEntity3);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str4);
                                        qg.a0 a0Var2 = a0Var;
                                        sb.append("/metadata.json");
                                        String string = sb.toString();
                                        byte[] bytes2 = vVarG.toString().getBytes(mh.a.f18238b);
                                        kotlin.jvm.internal.r.d(bytes2, "getBytes(...)");
                                        uh.t.a(zipOutputStream, string, bytes2);
                                        String sourcePath = projectEntity4.getSourcePath();
                                        if (sourcePath != null) {
                                            File file4 = new File(sourcePath);
                                            if (!file4.exists()) {
                                                str = str3;
                                                it3 = it2;
                                                projectEntity = projectEntity4;
                                            } else if (file4.isDirectory()) {
                                                h.b bVar = ah.l.p(file4).new b();
                                                while (bVar.hasNext()) {
                                                    File next2 = bVar.next();
                                                    if (next2.isFile()) {
                                                        str2 = str3;
                                                        String path = ah.l.l(next2, file4).getPath();
                                                        it4 = it2;
                                                        kotlin.jvm.internal.r.d(path, "getPath(...)");
                                                        projectEntity2 = projectEntity4;
                                                        uh.t.b(zipOutputStream, str4 + "/content/" + mh.t.m(path, '\\', '/'), next2);
                                                    } else {
                                                        str2 = str3;
                                                        it4 = it2;
                                                        projectEntity2 = projectEntity4;
                                                    }
                                                    it2 = it4;
                                                    str3 = str2;
                                                    projectEntity4 = projectEntity2;
                                                }
                                                str = str3;
                                                it3 = it2;
                                                projectEntity = projectEntity4;
                                            } else {
                                                str = str3;
                                                it3 = it2;
                                                projectEntity = projectEntity4;
                                                uh.t.b(zipOutputStream, str4 + "/content/" + file4.getName(), file4);
                                            }
                                        }
                                        String iconPath = projectEntity.getIconPath();
                                        if (iconPath != null) {
                                            File file5 = new File(iconPath);
                                            if (file5.exists()) {
                                                uh.t.b(zipOutputStream, str4 + "/icon/" + file5.getName(), file5);
                                            }
                                        }
                                        String splashPath = projectEntity.getSplashPath();
                                        if (splashPath != null) {
                                            File file6 = new File(splashPath);
                                            if (file6.exists()) {
                                                uh.t.b(zipOutputStream, str4 + "/splash/" + file6.getName(), file6);
                                            }
                                        }
                                        if (keystoreEntity3 != null) {
                                            j6.f(j6Var2, zipOutputStream, keystoreEntity3, str4 + "/keystore");
                                        }
                                        i112 = i12;
                                        a0Var = a0Var2;
                                        it2 = it3;
                                        str3 = str;
                                    }
                                    byte[] bytes3 = String.valueOf(jCurrentTimeMillis).getBytes(mh.a.f18238b);
                                    kotlin.jvm.internal.r.d(bytes3, "getBytes(...)");
                                    uh.t.a(zipOutputStream, "exported_at.txt", bytes3);
                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                    zipOutputStream.close();
                                    Uri uriForFile2 = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                                    Intent intent2 = new Intent("android.intent.action.SEND");
                                    intent2.setType("application/zip");
                                    intent2.putExtra("android.intent.extra.STREAM", uriForFile2);
                                    intent2.addFlags(1);
                                    return new pg.n(intent2, file);
                                } finally {
                                }
                            }
                        } else {
                            i0Var3 = i0Var;
                            map = linkedHashMap;
                            l11 = l12;
                            j10 = j12;
                            keystoreEntity2 = null;
                            map22 = linkedHashMap;
                            map22.put(l11, keystoreEntity2);
                            linkedHashMap = map;
                            i0Var = i0Var3;
                            if (it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j6 j6Var, Context context, boolean z10, tg.e<? super a> eVar) {
            super(1, eVar);
            this.f33406b = j6Var;
            this.f33407c = context;
            this.f33408d = z10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f33406b, this.f33407c, this.f33408d, eVar);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f33405a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            C0335a c0335a = new C0335a(this.f33406b, this.f33407c, this.f33408d, null);
            this.f33405a = 1;
            Object objE = ph.h.e(bVar, c0335a, this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(j6 j6Var, Context context, boolean z10, tg.e<? super y6> eVar) {
        super(2, eVar);
        this.f33402e = j6Var;
        this.f33403f = context;
        this.f33404g = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y6(this.f33402e, this.f33403f, this.f33404g, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Intent intent;
        File file;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33401d;
        Context context = this.f33403f;
        j6 j6Var = this.f33402e;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(j6Var, context, this.f33404g, null);
            this.f33401d = 1;
            objK = j6.k(j6Var, aVar2, this);
            if (objK != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f33400c;
            intent = this.f33399b;
            j6Var = this.f33398a;
            pg.q.b(obj);
            Intent intent2 = intent;
            Uri uri = (Uri) obj;
            String string = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string, "getString(...)");
            sh.z0 z0Var = j6Var.f32796w;
            j6.b bVar = new j6.b(intent2, uri, string, R.string.home_export_title, 16);
            z0Var.getClass();
            z0Var.j(null, bVar);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        objK = ((pg.p) obj).f21471a;
        Throwable thA = pg.p.a(objK);
        if (thA != null) {
            sh.z0 z0Var2 = j6Var.f32796w;
            Intent intent3 = new Intent();
            String message = thA.getMessage();
            if (message == null) {
                message = j6Var.F().getString(R.string.home_export_error);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            }
            j6.b bVar2 = new j6.b(intent3, null, message, R.string.home_export_title, 2);
            z0Var2.getClass();
            z0Var2.j(null, bVar2);
            return pg.f0.f21461a;
        }
        pg.n nVar = (pg.n) objK;
        intent = (Intent) nVar.f21469a;
        File file2 = (File) nVar.f21470b;
        this.f33398a = j6Var;
        this.f33399b = intent;
        this.f33400c = file2;
        this.f33401d = 2;
        Object objI = j6.i(j6Var, context, file2, this);
        if (objI != aVar) {
            file = file2;
            obj = objI;
            Intent intent22 = intent;
            Uri uri2 = (Uri) obj;
            String string2 = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string2, "getString(...)");
            sh.z0 z0Var3 = j6Var.f32796w;
            j6.b bVar3 = new j6.b(intent22, uri2, string2, R.string.home_export_title, 16);
            z0Var3.getClass();
            z0Var3.j(null, bVar3);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
