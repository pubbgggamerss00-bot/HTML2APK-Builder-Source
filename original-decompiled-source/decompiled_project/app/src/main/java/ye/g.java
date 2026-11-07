package ye;

import b.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import k1.q;

/* loaded from: classes2.dex */
public final class g implements b {
    public static String a(String str) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith("Windows 9") ? runtime.exec("command.com /c echo %windir%") : runtime.exec("cmd.exe /c echo %windir%")).getInputStream(), xe.a.f33561a));
        String line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    @Override // ye.b
    public final ArrayList j() {
        String strA;
        ArrayList arrayList = new ArrayList();
        try {
            strA = System.getProperty("env.windir");
        } catch (SecurityException unused) {
            strA = null;
        }
        String property = System.getProperty("os.name");
        if (strA == null) {
            try {
                strA = a(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        if (strA == null || strA.length() <= 2) {
            String str = property.endsWith("NT") ? "WINNT" : "WINDOWS";
            for (char c10 = 'C'; c10 <= 'E'; c10 = (char) (c10 + 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c10);
                sb.append(":");
                String str2 = File.separator;
                sb.append(str2);
                sb.append(str);
                sb.append(str2);
                sb.append("FONTS");
                File file = new File(sb.toString());
                if (file.exists() && file.canRead()) {
                    arrayList.add(file);
                    break;
                }
            }
            for (char c11 = 'C'; c11 <= 'E'; c11 = (char) (c11 + 1)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c11);
                sb2.append(":");
                File file2 = new File(o.a(sb2, File.separator, "PSFONTS"));
                if (file2.exists() && file2.canRead()) {
                    arrayList.add(file2);
                }
            }
        } else {
            if (strA.endsWith("/")) {
                strA = p3.c.a(1, 0, strA);
            }
            StringBuilder sbA = q.a(strA);
            String str3 = File.separator;
            File file3 = new File(o.a(sbA, str3, "FONTS"));
            if (file3.exists() && file3.canRead()) {
                arrayList.add(file3);
            }
            File file4 = new File(strA.substring(0, 2) + str3 + "PSFONTS");
            if (file4.exists() && file4.canRead()) {
                arrayList.add(file4);
            }
        }
        try {
            String str4 = System.getenv("LOCALAPPDATA");
            if (str4 != null && !str4.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                String str5 = File.separator;
                sb3.append(str5);
                sb3.append("Microsoft");
                sb3.append(str5);
                sb3.append("Windows");
                sb3.append(str5);
                sb3.append("Fonts");
                File file5 = new File(sb3.toString());
                if (file5.exists() && file5.canRead()) {
                    arrayList.add(file5);
                }
            }
        } catch (SecurityException unused3) {
        }
        return arrayList;
    }
}
