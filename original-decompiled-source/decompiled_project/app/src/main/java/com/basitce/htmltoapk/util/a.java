package com.basitce.htmltoapk.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.util.LauncherNameJob;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import pg.n;
import qg.k0;
import qg.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f5832a = p.j("default", "pdf_viewer", "html_viewer", "html_editor");

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5833b = k0.d(new n("default", ".LauncherDefault"), new n("pdf_viewer", ".LauncherPdfViewer"), new n("html_viewer", ".LauncherHtmlViewer"), new n("html_editor", ".LauncherHtmlEditor"));

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f5834c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f5835d;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static void a(Context context) {
        if (e(context)) {
            String strC = c(context);
            PackageManager packageManager = context.getPackageManager();
            try {
                r.b(packageManager);
                ?? r22 = f5833b;
                g(context, packageManager, (String) k0.c(strC, r22), true);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r22.entrySet()) {
                    if (!r.a((String) entry.getKey(), strC)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    g(context, packageManager, (String) it.next(), false);
                }
            } catch (Exception unused) {
            }
        }
        f5835d = e(context);
        if (f5835d) {
            return;
        }
        context.stopService(new Intent(context, (Class<?>) LauncherNameService.class));
    }

    public static void b(Context context, String choice) {
        r.e(context, "context");
        r.e(choice, "choice");
        if (f5832a.contains(choice)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("launcher_name", 0);
            r.d(sharedPreferences, "prefs(...)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("choice", choice);
            editorEdit.apply();
            f5835d = e(context);
            if (f5835d) {
                int i10 = LauncherNameJob.f5831a;
                LauncherNameJob.a.a(context);
                try {
                    context.startService(new Intent(context, (Class<?>) LauncherNameService.class));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static String c(Context context) {
        r.e(context, "context");
        String string = context.getSharedPreferences("launcher_name", 0).getString("choice", "default");
        if (string != null) {
            if (!f5832a.contains(string)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        return "default";
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public static boolean d(Context context, PackageManager packageManager, String str) {
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(context, k3.a.a(context.getPackageName(), str)));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && r.a(str, f5833b.get("default")));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static boolean e(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String strC = c(context);
            ?? r22 = f5833b;
            if (r22.isEmpty()) {
                return false;
            }
            for (Map.Entry entry : r22.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                r.b(packageManager);
                if (d(context, packageManager, str2) != r.a(str, strC)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int f(String choice) {
        r.e(choice, "choice");
        int iHashCode = choice.hashCode();
        return iHashCode != -1827323610 ? iHashCode != -1621628417 ? (iHashCode == 1976447105 && choice.equals("html_editor")) ? R.string.launcher_name_html_editor : R.string.app_name : !choice.equals("pdf_viewer") ? R.string.app_name : R.string.launcher_name_pdf_viewer : !choice.equals("html_viewer") ? R.string.app_name : R.string.launcher_name_html_viewer;
    }

    public static void g(Context context, PackageManager packageManager, String str, boolean z10) {
        ComponentName componentName = new ComponentName(context, k3.a.a(context.getPackageName(), str));
        int i10 = z10 ? 1 : 2;
        if (d(context, packageManager, str) == z10) {
            return;
        }
        packageManager.setComponentEnabledSetting(componentName, i10, 1);
    }
}
