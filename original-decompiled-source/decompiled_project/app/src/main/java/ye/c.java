package ye;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public b f34404a;

    public static void b(File file, ArrayList arrayList) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory()) {
                    String lowerCase = file2.getName().toLowerCase(Locale.US);
                    if ((lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf") || lowerCase.endsWith(".pfb") || lowerCase.endsWith(".ttc")) && !lowerCase.startsWith("fonts.")) {
                        arrayList.add(file2.toURI());
                    }
                } else if (!file2.getName().startsWith(".")) {
                    b(file2, arrayList);
                }
            }
        }
    }

    public final ArrayList a() {
        b gVar;
        if (this.f34404a == null) {
            if (System.getProperty("java.vendor").equals("The Android Project")) {
                gVar = new a();
            } else {
                String property = System.getProperty("os.name");
                gVar = property.startsWith("Windows") ? new g() : property.startsWith("Mac") ? new d() : property.startsWith("OS/400") ? new e() : new f();
            }
            this.f34404a = gVar;
        }
        ArrayList arrayListJ = this.f34404a.j();
        ArrayList arrayList = new ArrayList();
        int size = arrayListJ.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListJ.get(i10);
            i10++;
            b((File) obj, arrayList);
        }
        return arrayList;
    }
}
