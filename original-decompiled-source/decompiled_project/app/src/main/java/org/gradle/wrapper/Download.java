package org.gradle.wrapper;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import org.gradle.util.internal.WrapperCredentials;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Download.class */
public final class Download {
    public final Logger logger;
    public final DefaultDownloadProgressListener progressListener;
    public final Map systemProperties;
    public final int networkTimeout;

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Download$DefaultDownloadProgressListener.class */
    public final class DefaultDownloadProgressListener {
        public final Logger logger;
        public final DefaultDownloadProgressListener delegate = null;
        public int previousDownloadPercent = 0;

        public DefaultDownloadProgressListener(Logger logger) {
            this.logger = logger;
        }

        public final void downloadStatusChanged(long j10, long j11) {
            if (j10 > 0 && this.delegate == null) {
                try {
                    int iMin = (Math.min(100, Math.max(0, (int) ((j11 / j10) * 100.0d))) / 10) * 10;
                    if (iMin != 0 && this.previousDownloadPercent != iMin) {
                        ((Logger) this.logger.append(String.valueOf(iMin))).append('%');
                        this.previousDownloadPercent = iMin;
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
            if (j10 != j11) {
                this.logger.append(".");
            }
            DefaultDownloadProgressListener defaultDownloadProgressListener = this.delegate;
            if (defaultDownloadProgressListener != null) {
                defaultDownloadProgressListener.downloadStatusChanged(j10, j11);
            }
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Download$ProxyAuthenticator.class */
    public final class ProxyAuthenticator extends Authenticator {
        public final Map systemProperties;

        public ProxyAuthenticator(Map map) {
            this.systemProperties = map;
        }

        @Override // java.net.Authenticator
        public final PasswordAuthentication getPasswordAuthentication() {
            if (getRequestorType() == Authenticator.RequestorType.PROXY) {
                String protocol = getRequestingURL().getProtocol();
                String str = (String) this.systemProperties.get(protocol + ".proxyUser");
                if (str != null) {
                    String str2 = (String) this.systemProperties.get(protocol + ".proxyPassword");
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    return new PasswordAuthentication(str, str3.toCharArray());
                }
            }
            return super.getPasswordAuthentication();
        }
    }

    public static HashMap convertSystemProperties(Properties properties) {
        HashMap map = new HashMap();
        for (Map.Entry entry : properties.entrySet()) {
            map.put(entry.getKey().toString(), entry.getValue() == null ? null : entry.getValue().toString());
        }
        return map;
    }

    public Download(Logger logger, HashMap map, int i10) {
        this.logger = logger;
        this.systemProperties = map;
        this.progressListener = new DefaultDownloadProgressListener(logger);
        this.networkTimeout = i10;
        configureProxyAuthentication();
    }

    public static URI safeUri(URI uri) {
        try {
            return new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e10) {
            throw new RuntimeException("Failed to parse URI", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int, long] */
    public final void download(URI uri, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        file.getParentFile().mkdirs();
        BufferedOutputStream bufferedOutputStream2 = null;
        InputStream inputStream = null;
        URL url = safeUri(uri).toURL();
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (SocketTimeoutException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            addAuthentication(uri, uRLConnectionOpenConnection);
            uRLConnectionOpenConnection.setRequestProperty("User-Agent", calculateUserAgent());
            ?? r42 = this.networkTimeout;
            uRLConnectionOpenConnection.setConnectTimeout(r42);
            uRLConnectionOpenConnection.setReadTimeout(this.networkTimeout);
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                int responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                if (responseCode != 200) {
                    throw new IOException("Server returned HTTP response code: " + responseCode + " for URL: " + url);
                }
            }
            InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
            byte[] bArr = new byte[10240];
            int contentLength = uRLConnectionOpenConnection.getContentLength();
            long j10 = 0;
            long j11 = 0;
            while (true) {
                int i10 = inputStream2.read(bArr);
                if (i10 == -1) {
                    this.logger.log("");
                    inputStream2.close();
                    bufferedOutputStream.close();
                    return;
                } else {
                    if (Thread.currentThread().isInterrupted()) {
                        throw new IOException("Download was interrupted.");
                    }
                    long j12 = j10 + i10;
                    long j13 = r42;
                    if ((j11 + r42) / 1048576 > 0 || j12 == contentLength) {
                        j13 -= 1048576;
                        this.progressListener.downloadStatusChanged(contentLength, j12);
                    }
                    bufferedOutputStream.write(bArr, 0, i10);
                    j11 = j13;
                    j10 = j12;
                }
            }
        } catch (SocketTimeoutException e11) {
            e = e11;
            bufferedOutputStream2 = bufferedOutputStream;
            throw new IOException("Downloading from " + url + " failed: timeout (" + this.networkTimeout + "ms)", e);
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            this.logger.log("");
            if (0 != 0) {
                inputStream.close();
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    public final void configureProxyAuthentication() {
        if (this.systemProperties.get("http.proxyUser") == null && this.systemProperties.get("https.proxyUser") == null) {
            return;
        }
        Authenticator.setDefault(new ProxyAuthenticator(this.systemProperties));
    }

    public final void addAuthentication(URI uri, URLConnection uRLConnection) {
        WrapperCredentials wrapperCredentials;
        WrapperCredentials wrapperCredentials2;
        String str;
        Map map = this.systemProperties;
        Objects.requireNonNull(map);
        Function function = (v1) -> {
            return r1.get(v1);
        };
        Objects.requireNonNull(uri, "distributionUrl");
        Objects.requireNonNull(function, "propertyProvider");
        String strTryGetProperty = WrapperCredentials.tryGetProperty(uri.getHost(), "wrapperToken", function);
        if (strTryGetProperty != null) {
            wrapperCredentials2 = wrapperCredentials;
            WrapperCredentials wrapperCredentials3 = new WrapperCredentials(strTryGetProperty, null);
        } else {
            String host = uri.getHost();
            String strTryGetProperty2 = WrapperCredentials.tryGetProperty(host, "wrapperUser", function);
            String strTryGetProperty3 = WrapperCredentials.tryGetProperty(host, "wrapperPassword", function);
            if (strTryGetProperty2 == null || strTryGetProperty3 == null) {
                String userInfo = uri.getUserInfo();
                if (userInfo != null) {
                    wrapperCredentials = wrapperCredentials;
                    WrapperCredentials wrapperCredentials4 = new WrapperCredentials(null, userInfo);
                } else {
                    wrapperCredentials = null;
                }
            } else {
                wrapperCredentials = wrapperCredentials;
                WrapperCredentials wrapperCredentials5 = new WrapperCredentials(null, (String) Objects.requireNonNull(strTryGetProperty2 + ':' + strTryGetProperty3, "basicUserInfo"));
            }
            wrapperCredentials2 = wrapperCredentials;
        }
        if (wrapperCredentials2 == null) {
            return;
        }
        if (!"https".equals(uri.getScheme())) {
            this.logger.log("WARNING Using HTTP " + (wrapperCredentials2.token != null ? "Bearer Token" : "Basic") + " Authentication over an insecure connection to download the Gradle distribution. Please consider using HTTPS.");
        }
        if (wrapperCredentials2.token != null) {
            str = "Bearer " + wrapperCredentials2.token;
        } else {
            if (wrapperCredentials2.basicUserInfo == null) {
                throw new AssertionError("Internal error: Unexpected credentials state.");
            }
            str = "Basic " + Base64.getEncoder().encodeToString(wrapperCredentials2.basicUserInfo.getBytes(StandardCharsets.UTF_8));
        }
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry("Authorization", str);
        uRLConnection.setRequestProperty((String) simpleImmutableEntry.getKey(), (String) simpleImmutableEntry.getValue());
    }

    public final String calculateUserAgent() {
        return String.format("%s/%s (%s;%s;%s) (%s;%s;%s)", "gradlew", d.L0, (String) this.systemProperties.get("os.name"), (String) this.systemProperties.get("os.version"), (String) this.systemProperties.get("os.arch"), (String) this.systemProperties.get("java.vendor"), (String) this.systemProperties.get("java.version"), (String) this.systemProperties.get("java.vm.version"));
    }
}
