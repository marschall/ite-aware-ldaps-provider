module com.github.marschall.siteawareldapsprovider {

  requires java.naming;

  provides javax.naming.ldap.spi.LdapDnsProvider with com.github.marschall.siteawareldapsprovider.SiteAwareLdapsProvider;

}