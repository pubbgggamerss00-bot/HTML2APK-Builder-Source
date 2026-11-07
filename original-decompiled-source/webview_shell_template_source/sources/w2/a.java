package w2;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f14864t;

    public /* synthetic */ a(t tVar, int i6) {
        this.s = i6;
        this.f14864t = tVar;
    }

    @Override // p5.a
    public final Object a() {
        long j6;
        switch (this.s) {
            case 0:
                t tVar = this.f14864t;
                tVar.j();
                tVar.i();
                break;
            case 1:
                this.f14864t.r(1);
                break;
            default:
                t tVar2 = this.f14864t;
                File file = new File(tVar2.getContext().getFilesDir(), "pdfviewer");
                file.mkdirs();
                int i6 = 0;
                try {
                    j6 = tVar2.getContext().getPackageManager().getPackageInfo(tVar2.getContext().getPackageName(), 0).lastUpdateTime;
                } catch (Exception unused) {
                    j6 = 0;
                }
                String str = "asset_" + Integer.toHexString(269670167) + "_" + j6 + ".pdf";
                File file2 = new File(file, str);
                if (!file2.isFile() || file2.length() <= 0) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList = new ArrayList();
                        for (File file3 : fileArrListFiles) {
                            String name = file3.getName();
                            kotlin.jvm.internal.j.d("getName(...)", name);
                            if (x5.l.n(name, "asset_", false)) {
                                arrayList.add(file3);
                            }
                        }
                        int size = arrayList.size();
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            ((File) obj).delete();
                        }
                    }
                    File file4 = new File(file, androidx.camera.core.c.b(str, ".part"));
                    tVar2.c(new c(0, tVar2), file4);
                    if (!file4.renameTo(file2)) {
                        throw new IllegalStateException("Cannot store PDF");
                    }
                }
                return file2;
        }
        return d5.j.f12745a;
    }
}
