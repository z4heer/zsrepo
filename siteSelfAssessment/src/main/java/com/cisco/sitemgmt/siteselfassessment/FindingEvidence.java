package com.cisco.sitemgmt.siteselfassessment;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class FindingEvidence implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "FINDINGEVIDENCE_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "FINDINGEVIDENCE_ID_GENERATOR", sequenceName = "FINDINGEVIDENCE_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Integer assessmentId;

   private java.lang.String evidence;

   private java.lang.String owner;

   private java.lang.String securityTeam;

   private java.lang.String stakehoilder;

   private java.lang.Boolean approved;

   private java.lang.Boolean reviewed;

   private java.lang.Boolean closed;

   public FindingEvidence()
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

   public java.lang.Integer getAssessmentId()
   {
      return this.assessmentId;
   }

   public void setAssessmentId(java.lang.Integer assessmentId)
   {
      this.assessmentId = assessmentId;
   }

   public java.lang.String getEvidence()
   {
      return this.evidence;
   }

   public void setEvidence(java.lang.String evidence)
   {
      this.evidence = evidence;
   }

   public java.lang.String getOwner()
   {
      return this.owner;
   }

   public void setOwner(java.lang.String owner)
   {
      this.owner = owner;
   }

   public java.lang.String getSecurityTeam()
   {
      return this.securityTeam;
   }

   public void setSecurityTeam(java.lang.String securityTeam)
   {
      this.securityTeam = securityTeam;
   }

   public java.lang.String getStakehoilder()
   {
      return this.stakehoilder;
   }

   public void setStakehoilder(java.lang.String stakehoilder)
   {
      this.stakehoilder = stakehoilder;
   }

   public java.lang.Boolean getApproved()
   {
      return this.approved;
   }

   public void setApproved(java.lang.Boolean approved)
   {
      this.approved = approved;
   }

   public java.lang.Boolean getReviewed()
   {
      return this.reviewed;
   }

   public void setReviewed(java.lang.Boolean reviewed)
   {
      this.reviewed = reviewed;
   }

   public java.lang.Boolean getClosed()
   {
      return this.closed;
   }

   public void setClosed(java.lang.Boolean closed)
   {
      this.closed = closed;
   }

   public FindingEvidence(java.lang.Long id, java.lang.Integer assessmentId,
         java.lang.String evidence, java.lang.String owner,
         java.lang.String securityTeam, java.lang.String stakehoilder,
         java.lang.Boolean approved, java.lang.Boolean reviewed,
         java.lang.Boolean closed)
   {
      this.id = id;
      this.assessmentId = assessmentId;
      this.evidence = evidence;
      this.owner = owner;
      this.securityTeam = securityTeam;
      this.stakehoilder = stakehoilder;
      this.approved = approved;
      this.reviewed = reviewed;
      this.closed = closed;
   }

}