package com.rsosor.auth.bcrypt;

import com.rsosor.auth.password.PasswordEncoder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.security.SecureRandom;
import java.util.regex.Pattern;

public class BCryptPasswordEncoder implements PasswordEncoder {

    private Pattern BCRYPT_PATTERN;

    private final Log logger;

    private final int strength;

    private final BCryptPasswordEncoder.BCryptVersion version;

    private final SecureRandom random;

    public BCryptPasswordEncoder() {
        this(-1);
    }

    public BCryptPasswordEncoder(int strength) {
        this(strength, (SecureRandom)null);
    }

    public BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion version) {
        this(version, (SecureRandom)null);
    }

    public BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion version, SecureRandom random) {
        this(version, -1, random);
    }

    public BCryptPasswordEncoder(int strength, SecureRandom random) {
        this(BCryptPasswordEncoder.BCryptVersion.$2A, strength, random);
    }

    public BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion version, int strength) {
        this(version, strength, (SecureRandom)null);
    }

    public BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion version, int strength, SecureRandom random) {
        this.BCRYPT_PATTERN = Pattern.compile("\\A\\$2(a|y|b)?\\$(\\d\\d)\\$[./0-9A-Za-z]{53}");
        this.logger = LogFactory.getLog(this.getClass());
        if (strength == -1 || strength >= 4 && strength <= 31) {
            this.version = version;
            this.strength = strength == -1 ? 10 : strength;
            this.random = random;
        } else {
            throw new IllegalArgumentException("Bad strength");
        }
    }

    public String encode(CharSequence rawPassword) {
        if (rawPassword == null) {
            throw new IllegalArgumentException("rawPassword cannot be null");
        } else {
            String salt = this.getSalt();
            return BCrypt.hashpw(rawPassword.toString(), salt);
        }
    }

    private String getSalt() {
        return this.random !=
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return PasswordEncoder.super.upgradeEncoding(encodedPassword);
    }

    public static enum BCryptVersion {
        $2A("$2a"),
        $2Y("$2y"),
        $2B("$2b");

        private final String version;

        private BCryptVersion(String version) {
            this.version = version;
        }

        public String getVersion() {
            return this.version;
        }
    }
}
