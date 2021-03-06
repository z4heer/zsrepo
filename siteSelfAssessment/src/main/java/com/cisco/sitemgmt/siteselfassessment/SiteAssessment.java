package com.cisco.sitemgmt.siteselfassessment;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class SiteAssessment implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SITEASSESSMENT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "SITEASSESSMENT_ID_GENERATOR", sequenceName = "SITEASSESSMENT_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String title;

   private java.lang.String stakeholder;

   private java.lang.String auditTitle;

   private java.lang.String status;

   public SiteAssessment()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getStakeholder()
   {
      return this.stakeholder;
   }

   public void setStakeholder(java.lang.String stakeholder)
   {
      this.stakeholder = stakeholder;
   }

   public java.lang.String getAuditTitle()
   {
      return this.auditTitle;
   }

   public void setAuditTitle(java.lang.String auditTitle)
   {
      this.auditTitle = auditTitle;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public SiteAssessment(java.lang.Long id, java.lang.String title,
         java.lang.String stakeholder, java.lang.String auditTitle,
         java.lang.String status)
   {
      this.id = id;
      this.title = title;
      this.stakeholder = stakeholder;
      this.auditTitle = auditTitle;
      this.status = status;
   }

}