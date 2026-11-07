package org.gradle.wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.gradle.util.internal.WrapperDistributionUrlConverter;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/WrapperExecutor.class */
public final class WrapperExecutor {
    public final Properties properties;
    public final File propertiesFile;
    public final WrapperConfiguration config;

    public WrapperExecutor(File file, Properties properties) {
        WrapperConfiguration wrapperConfiguration = new WrapperConfiguration();
        this.config = wrapperConfiguration;
        this.properties = properties;
        this.propertiesFile = file;
        if (file.exists()) {
            try {
                loadProperties(file, properties);
                wrapperConfiguration.setDistribution(WrapperDistributionUrlConverter.convertDistributionUrl(file.getParentFile(), readDistroUrl()));
                wrapperConfiguration.setDistributionBase(getProperty("distributionBase", wrapperConfiguration.getDistributionBase()));
                wrapperConfiguration.setDistributionPath(getProperty("distributionPath", wrapperConfiguration.getDistributionPath()));
                wrapperConfiguration.setDistributionSha256Sum(getProperty("distributionSha256Sum", wrapperConfiguration.getDistributionSha256Sum(), false));
                wrapperConfiguration.setZipBase(getProperty("zipStoreBase", wrapperConfiguration.getZipBase()));
                wrapperConfiguration.setZipPath(getProperty("zipStorePath", wrapperConfiguration.getZipPath()));
                wrapperConfiguration.setNetworkTimeout(getProperty("networkTimeout", wrapperConfiguration.getNetworkTimeout()));
                wrapperConfiguration.setValidateDistributionUrl(getProperty(wrapperConfiguration.getValidateDistributionUrl()));
                wrapperConfiguration.setRetries(getProperty("retries", wrapperConfiguration.getRetries()));
                wrapperConfiguration.setRetryBackOffMs(getProperty("retryBackOffMs", wrapperConfiguration.getRetryBackOffMs()));
            } catch (Exception e10) {
                throw new RuntimeException(String.format("Could not load wrapper properties from '%s'.", file), e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Throwable] */
    public static void loadProperties(File file, Properties properties) throws IOException {
        ?? fileInputStream = new FileInputStream(file);
        try {
            properties.load((InputStream) fileInputStream);
            fileInputStream.close();
        } catch (Throwable th2) {
            th2.close();
            throw fileInputStream;
        }
    }

    public final String readDistroUrl() {
        if (this.properties.getProperty("distributionUrl") != null) {
            return getProperty("distributionUrl", null, true);
        }
        throw new RuntimeException(String.format("No value with key '%s' specified in wrapper properties file '%s'.", "distributionUrl", this.propertiesFile));
    }

    public final int getProperty(String str, int i10) {
        return Integer.parseInt(getProperty(str, String.valueOf(i10), true));
    }

    public final String getProperty(String str, String str2) {
        return getProperty(str, str2, true);
    }

    public final String getProperty(String str, String str2, boolean z10) {
        String property = this.properties.getProperty(str);
        if (property != null) {
            return property;
        }
        if (str2 != null) {
            return str2;
        }
        if (z10) {
            throw new RuntimeException(String.format("No value with key '%s' specified in wrapper properties file '%s'.", str, this.propertiesFile));
        }
        return null;
    }

    public final boolean getProperty(boolean z10) {
        return Boolean.parseBoolean(getProperty("validateDistributionUrl", String.valueOf(z10), true));
    }
}
