package com.basitce.htmltoapk.domain.model;

import c0.u0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f;
import kotlin.jvm.internal.r;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.v;
import kotlinx.serialization.json.w;
import m9.v1;
import mh.x;

/* loaded from: classes.dex */
public final class WebViewSettingsKt {
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final int enabledCount(WebViewSettings webViewSettings) {
        r.e(webViewSettings, "<this>");
        ?? javaScriptEnabled = webViewSettings.getJavaScriptEnabled();
        int i10 = javaScriptEnabled;
        if (webViewSettings.getDomStorageEnabled()) {
            i10 = javaScriptEnabled + 1;
        }
        int i11 = i10;
        if (webViewSettings.getAllowFileAccess()) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (webViewSettings.getAllowContentAccess()) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (webViewSettings.getAllowUniversalAccessFromFileURLs()) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (webViewSettings.getAllowFileAccessFromFileURLs()) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (webViewSettings.getBuiltInZoomControls()) {
            i15 = i14 + 1;
        }
        int i16 = i15;
        if (webViewSettings.getUseWideViewPort()) {
            i16 = i15 + 1;
        }
        int i17 = i16;
        if (webViewSettings.getLoadWithOverviewMode()) {
            i17 = i16 + 1;
        }
        int i18 = i17;
        if (webViewSettings.getUserAgent() != null) {
            i18 = i17;
            if (!x.A(r1)) {
                i18 = i17 + 1;
            }
        }
        int i19 = i18;
        if (webViewSettings.getGeolocationEnabled()) {
            i19 = i18 + 1;
        }
        int i20 = i19;
        if (webViewSettings.getPullToRefresh()) {
            i20 = i19 + 1;
        }
        int i21 = i20;
        if (webViewSettings.getNoInternetDialog()) {
            i21 = i20 + 1;
        }
        int i22 = i21;
        if (webViewSettings.getLoadingIndicator()) {
            i22 = i21 + 1;
        }
        int i23 = i22;
        if (webViewSettings.getBackHistoryNavigation()) {
            i23 = i22 + 1;
        }
        return webViewSettings.getExitConfirmationDialog() ? i23 + 1 : i23;
    }

    public static final boolean opensExternalPdfs(WebViewSettings webViewSettings, boolean z10) {
        r.e(webViewSettings, "<this>");
        Boolean openExternalPdfs = webViewSettings.getOpenExternalPdfs();
        return openExternalPdfs != null ? openExternalPdfs.booleanValue() : z10;
    }

    public static final v pdfReaderJson(WebViewSettings webViewSettings) {
        r.e(webViewSettings, "<this>");
        w wVar = new w();
        wVar.b("scrollMode", i.b(r.a(webViewSettings.getPdfScrollMode(), "horizontal") ? "horizontal" : "vertical"));
        String pdfNightMode = webViewSettings.getPdfNightMode();
        if (!r.a(pdfNightMode, f.f6996m) && !r.a(pdfNightMode, "system")) {
            pdfNightMode = f.f6997n;
        }
        wVar.b("nightMode", i.b(pdfNightMode));
        u0.b(wVar, "rememberPage", Boolean.valueOf(webViewSettings.getPdfRememberPage()));
        u0.b(wVar, "showToolbar", Boolean.valueOf(webViewSettings.getPdfShowToolbar()));
        u0.b(wVar, "showPageIndicator", Boolean.valueOf(webViewSettings.getPdfShowPageIndicator()));
        u0.b(wVar, "fastScroll", Boolean.valueOf(webViewSettings.getPdfFastScroll()));
        u0.b(wVar, "zoomEnabled", Boolean.valueOf(webViewSettings.getPdfZoomEnabled()));
        u0.b(wVar, "bookmarks", Boolean.valueOf(webViewSettings.getPdfBookmarks()));
        u0.b(wVar, "allowExport", Boolean.valueOf(webViewSettings.getPdfAllowExport()));
        int pdfStartPage = webViewSettings.getPdfStartPage();
        if (pdfStartPage < 1) {
            pdfStartPage = 1;
        }
        wVar.b("startPage", i.a(Integer.valueOf(pdfStartPage)));
        return wVar.a();
    }

    public static final v1 pdfReaderOptions(WebViewSettings webViewSettings, int i10, String title) {
        r.e(webViewSettings, "<this>");
        r.e(title, "title");
        String str = r.a(webViewSettings.getPdfScrollMode(), "horizontal") ? "horizontal" : "vertical";
        String pdfNightMode = webViewSettings.getPdfNightMode();
        if (!r.a(pdfNightMode, f.f6996m) && !r.a(pdfNightMode, "system")) {
            pdfNightMode = f.f6997n;
        }
        String str2 = pdfNightMode;
        String colorMode = webViewSettings.getColorMode();
        boolean pdfRememberPage = webViewSettings.getPdfRememberPage();
        boolean pdfShowToolbar = webViewSettings.getPdfShowToolbar();
        boolean pdfShowPageIndicator = webViewSettings.getPdfShowPageIndicator();
        boolean pdfFastScroll = webViewSettings.getPdfFastScroll();
        boolean pdfZoomEnabled = webViewSettings.getPdfZoomEnabled();
        boolean pdfBookmarks = webViewSettings.getPdfBookmarks();
        boolean pdfAllowExport = webViewSettings.getPdfAllowExport();
        int pdfStartPage = webViewSettings.getPdfStartPage();
        return new v1(str, str2, colorMode, pdfRememberPage, pdfShowToolbar, pdfShowPageIndicator, pdfFastScroll, pdfZoomEnabled, pdfBookmarks, pdfAllowExport, pdfStartPage < 1 ? 1 : pdfStartPage, i10, title);
    }

    public static final int webViewMixedContentMode(WebViewSettings webViewSettings) {
        r.e(webViewSettings, "<this>");
        int mixedContentMode = webViewSettings.getMixedContentMode();
        if (mixedContentMode != 0) {
            return mixedContentMode != 2 ? 0 : 2;
        }
        return 1;
    }
}
